package src;

import java.util.Scanner;

/**
 *
 * @author Nguyen Chinh
 */

public class Main {
    static void menu() {
        System.out.println("||===========================MENU==============================||");
        System.out.println("|| 0 - Thoát                                                   ||");
        System.out.println("|| 1 - Nhập DS hóa đơn                                         ||");
        System.out.println("|| 2 - Xem DS hóa đơn                                          ||");
        System.out.println("|| 3 - Tính tổng tiền tất cả các hóa đơn                       ||");
        System.out.println("|| 4 - Tìm kiếm hóa đơn theo tên khách hàng                    ||");
        System.out.println("|| 5 - Sắp xếp các hóa đơn theo tiền trả                       ||");
        System.out.println("|| 6 - Khách thuê lâu nhất                                     ||");
        System.out.println("|| 7 - Lưu DS hóa đơn                                          ||");
        System.out.println("|| 8 - Đọc DS hóa đơn                                          ||");
        System.out.println("|| 9 - Thêm hóa đơn                                            ||");
        System.out.println("|| 10 - Đếm số lượng hóa đơn                                   ||");
        System.out.println("||===========================END===============================||");
    }
    
    public static void main(String[] args) {
        DSHD ds = new DSHD();
        int chon;
        System.out.println("\n\t\tCHUONG TRINH QUAN LY KHACH SAN");
        do {            
            menu();
            System.out.print("Lựa chon: ");
            chon = new Scanner(System.in).nextInt();
            switch(chon) {
                case 1: 
                    ds.nhapDS();
                    break;
                case 2:
                    ds.xuatDS();
                    break;
                case 3:
                    System.out.println("Tong tien = " + ds.tongTien());
                    break;
                case 4:
                    ds.timKiemTheoTenKH();
                    break;
                case 5:
                    ds.sapXepTheoTien();
                    break;
                case 6:
                    ds.khachThueLauNhat();
                    break;
                case 7:
                    ds.ghiFile();
                    break;
                case 8:
                    ds.docFile();
                    break;
                case 9:
                    ds.them();
                    break;
                case 10:
                    System.out.println("So luong = " + ds.listHoaDon.size());
                    break;
                default: 
                    break;
            }
        } while (chon != 0);
    }
    
}
    

