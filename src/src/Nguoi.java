/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Nguyen Chinh
 */
public class Nguoi implements Serializable {

    private String hoTen;
    private String gioiTinh, diaChi, sDT, sCMT;
    private int namSinh;

    public Nguoi() {
        hoTen = "";
        gioiTinh = "";
        diaChi = "";
        sDT = "";
        sCMT = "";
        namSinh = 0;
    }

    public Nguoi(String hoTen, String gioiTinh, String diaChi, String sDT, String sCMT, int namSinh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.sDT = sDT;
        this.sCMT = sCMT;
        this.namSinh = namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsDT() {
        return sDT;
    }

    public void setsDT(String sDT) {
        this.sDT = sDT;
    }

    public String getsCMT() {
        return sCMT;
    }

    public void setsCMT(String sCMT) {
        this.sCMT = sCMT;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.print("Nhap so dien thoai: ");
        sDT = sc.nextLine();
        System.out.print("Nhap so CMT/CCCD: ");
        sCMT = sc.nextLine();
    }
    
    public void xuat() {
    }

}
