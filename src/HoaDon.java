/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class HoaDon extends KhachHang {
    private String ngayLap, ngayDen, ngayDi;
    private int soNgayThue;
    NhanVien nhanVienLap;
    ArrayList<Phong> dSPhongThue = new ArrayList<>();

    public HoaDon() {
    }
    
    static void ke() {
        System.out.println(" ----------------------------------------------------------------------------------------------------------------");
    }
    
    public HoaDon(String ngayLap, String ngayDen, String ngayDi, int soNgayThue, NhanVien nhanVienLap, ArrayList<Phong> dSPhongThue, String maKH, String hoTen, String gioiTinh, String diaChi, String sDT, String sCMT, int namSinh) {
        super(maKH, hoTen, gioiTinh, diaChi, sDT, sCMT, namSinh);
        this.ngayLap = ngayLap;
        this.ngayDen = ngayDen;
        this.ngayDi = ngayDi;
        this.soNgayThue = soNgayThue;
        this.nhanVienLap = nhanVienLap;
        this.dSPhongThue = dSPhongThue;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public String getNgayDi() {
        return ngayDi;
    }

    public void setNgayDi(String ngayDi) {
        this.ngayDi = ngayDi;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    public NhanVien getNhanVienLap() {
        return nhanVienLap;
    }

    public void setNhanVienLap(NhanVien nhanVienLap) {
        this.nhanVienLap = nhanVienLap;
    }

    public ArrayList<Phong> getdSPhongThue() {
        return dSPhongThue;
    }

    public void setdSPhongThue(ArrayList<Phong> dSPhongThue) {
        this.dSPhongThue = dSPhongThue;
    }
    
    public void nhap() {
        int sLPT;
        System.out.println("Nhap thong tin khach hang");
        super.nhap();
        System.out.print("Ngay lap: ");
        Scanner sc = new Scanner(System.in);
        ngayLap = sc.nextLine();
        System.out.print("Ngay den: ");
        ngayDen = sc.nextLine();
        System.out.print("Ngay di: ");
        ngayDi = sc.nextLine();
        System.out.print("So ngay thue: ");
        soNgayThue = sc.nextInt();
        System.out.println("Nhan vien lap");
        nhanVienLap = new NhanVien();
        this.nhanVienLap.nhap();
        System.out.println("Nhap so luong phong thue: ");
        sLPT = sc.nextInt();
        dSPhongThue = new ArrayList();
        for (int i = 0; i < sLPT; i++) {
            Phong x = new Phong();
            x.nhap();
            dSPhongThue.add(x);
        }
    }
    
    public void xuat() {
        ke();
        System.out.println("|\tTHONG TIN KHACH HANG");
        super.xuat();
        System.out.println("\n|\tTHONG TIN NHAN VIEN NHAP");
        nhanVienLap.xuat();
        System.out.println("\n|\tDS CAC PHONG THUE");
        System.out.printf("|\t%-15s%-7s", "Ma Phong", "Don Gia");
        for (Phong x: dSPhongThue)
            x.xuat();
        System.out.println("\n|\tTong tien = " + tinhTien());
        ke();
    }
    
    public double tinhTien() {
        double tien = 0;
        for (Phong x: dSPhongThue)
            tien += x.getDonGia() * soNgayThue;
        return tien;
    }
    
}
