/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author ThinkPad
 */
public class NhanVien extends Nguoi {
    private String maNV, chucVu;

    public NhanVien() {
        super();
        maNV = "";
        chucVu = "";
    }

    public NhanVien(String maNV, String chucVu, String hoTen, String gioiTinh, String diaChi, String sDT, String sCMT, int namSinh) {
        super(hoTen, gioiTinh, diaChi, sDT, sCMT, namSinh);
        this.maNV = maNV;
        this.chucVu = chucVu;
    }
    
    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getChucVu() {
        return chucVu;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }
    
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan vien: ");
        maNV = sc.nextLine();
        System.out.print("Nhap chuc vu: ");
        chucVu = sc.nextLine();
    }
    
    public void xuat() {
        System.out.printf("|\t%-7s%-20s%-11s%-13s%-20s%-12s%-11s%-15s", "Ma NV", "Ten", "Gioi tinh", "Nam Sinh", "Dia chi", "Chuc vu", "SDT", "So CMT");
        System.out.printf("\n|\t%-7s%-20s%-11s%-13d%-20s%-12s%-11s%-15s", maNV, this.getHoTen(), this.getGioiTinh(), this.getNamSinh(), this.getDiaChi(), chucVu, this.getsDT(), this.getsCMT());
    }
        
}
