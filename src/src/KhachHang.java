/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.Scanner;

/**
 *
 * @author Nguyen Chinh
 */
public class KhachHang extends Nguoi {
    private String maKH;

    public KhachHang() {
        super();
        maKH = "";
    }    

    public KhachHang(String maKH, String hoTen, String gioiTinh, String diaChi, String sDT, String sCMT, int namSinh) {
        super(hoTen, gioiTinh, diaChi, sDT, sCMT, namSinh);
        this.maKH = maKH;
    }
    
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma khach hang: ");
        maKH = sc.nextLine();
    }
    
    public void xuat() {
        System.out.printf("|\t%-7s%-20s%-11s%-13s%-20s%-11s%-15s", "Ma KH", "Ten", "Gioi tinh", "Nam Sinh", "Dia chi", "SDT", "So CMT");
        System.out.printf("\n|\t%-7s%-20s%-11s%-13d%-20s%-11s%-15s", maKH, this.getHoTen(), this.getGioiTinh(), this.getNamSinh(), this.getDiaChi(), this.getsDT(), this.getsCMT());
    }
    
}
