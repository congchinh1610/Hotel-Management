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
public class DSNV {
    ArrayList<Nguoi> lstNguoi;
    float soQL = 0, soNV = 0;

    public DSNV() {
    }

    public DSNV(ArrayList<Nguoi> lstNguoi) {
        this.lstNguoi = lstNguoi;
    }

    public ArrayList<Nguoi> getLstNguoi() {
        return lstNguoi;
    }

    public void setLstNguoi(ArrayList<Nguoi> lstNguoi) {
        this.lstNguoi = lstNguoi;
    }

    public float getSoQL() {
        return soQL;
    }

    public void setSoQL(float soQL) {
        this.soQL = soQL;
    }

    public float getSoNV() {
        return soNV;
    }

    public void setSoNV(float soNV) {
        this.soNV = soNV;
    }

    
    void nhapDS() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so can bo: ");
        int n = sc.nextInt();
        lstNguoi = new ArrayList();
        for (int i = 0; i < n; i++) {
            System.out.println("Doi tuong can nhap (1. Quan ly, 2. Nhan vien, 3. Khach hang): ");
            int chon = sc.nextInt();
            if (chon == 1) {
                QuanLy x = new QuanLy();
                x.nhap();
                lstNguoi.add(x);
                soQL++;
            }
            else if (chon == 2) {
                NhanVien x = new NhanVien();
                x.nhap();
                lstNguoi.add(x);
                soNV++;
            }
            else if (chon == 3) {
                KhachHang x = new KhachHang();
                x.nhap();
                lstNguoi.add(x);
            }
            else i--;
        }
        System.out.println("So QL = " + soQL);
        System.out.println("So NV = " + soNV);
    }
    
    public float tyLe() {
        return (float) (soQL / soNV) * 100;
    }
    
}
