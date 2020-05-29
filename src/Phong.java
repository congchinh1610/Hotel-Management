package src;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Nguyen Chinh
 */

public class Phong implements Serializable {
    private String maPhong;
    private int donGia;

    public Phong() {
    }

    public Phong(String maPhong, int donGia) {
        this.maPhong = maPhong;
        this.donGia = donGia;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
    public void nhap() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ma phong: ");
        maPhong = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextInt();
    }
    public void xuat() {
        System.out.printf("\n|\t%-15s%-7d", maPhong, donGia);
    }  
    
}
