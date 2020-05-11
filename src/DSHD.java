/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.*;
import java.util.*;


/**
 *
 * @author ThinkPad
 */
public class DSHD implements Serializable {
    ArrayList<HoaDon> listHoaDon;
    
    public DSHD() {
        this.listHoaDon = new ArrayList<>();
    }
    
    public void nhapDS() {
        System.out.println("Nhap so hoa don: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            HoaDon x = new HoaDon();
            x.nhap();
            listHoaDon.add(x);
        }
    }
    
    public void them() {
        HoaDon x = new HoaDon();
        x.nhap();
        listHoaDon.add(x);
    }
    
    public void xuatDS() {
        for (HoaDon x: listHoaDon)
            x.xuat();
    }
    
    public double tongTien() {
        double sum = 0;
        for (HoaDon x: listHoaDon)
            sum += x.tinhTien();
        return sum;
    }
    
    public void timKiemTheoTenKH() {
        System.out.print("Nhap ten khach hang can tim: ");
        String ten = new Scanner(System.in).nextLine();
        for (HoaDon x: listHoaDon) {
            if (x.getHoTen().equalsIgnoreCase(ten))
                x.xuat();
        }
    }
    
    public void sapXepTheoTien() {
        Collections.sort(listHoaDon, new SapXepTheoTien());
        System.out.println("Danh sach hoa don sau khi sap xep theo tien: ");
        xuatDS();
    }
    
    public void khachThueLauNhat() {
        int temp = 0;
        for (HoaDon x: listHoaDon) {
            if(x.getSoNgayThue() > temp)
                temp = x.getSoNgayThue();
        }
        System.out.println("Khach thue lau nhat:");
        for (HoaDon x: listHoaDon) {
            if (temp == x.getSoNgayThue())
                System.out.println(x.getHoTen());
        }
    }
    
    public void ghiFile() {
        File fname = new File("dshd.dat");
        try {
            FileOutputStream fout = new FileOutputStream(fname);
            ObjectOutputStream objOut = new ObjectOutputStream(fout);
            objOut.writeObject(this.listHoaDon);
            objOut.close();
            fout.close();
            System.out.println("LUU THANH CONG!");
        } catch (Exception ex) {
            ex.toString();
        }
    }

    public void docFile() {
        File fname = new File("dshd.dat");
        if (!fname.exists()) {
            System.out.print("\nKhông tìm thấy File");
            return;
        }
        try {
            FileInputStream fin = new FileInputStream(fname);
            ObjectInputStream objIn = new ObjectInputStream(fin);
            this.listHoaDon = (ArrayList) objIn.readObject();
            fin.close();
            objIn.close();
            if (listHoaDon.size() == 0) {
                System.out.print("\nFile không có dữ liệu");
                return;
            }
            for (int i = 0; i < listHoaDon.size(); i++) {
                HoaDon hd = listHoaDon.get(i);
            }
            xuatDS();
        } catch (Exception ex) {
            ex.toString();
        }
    }

}
