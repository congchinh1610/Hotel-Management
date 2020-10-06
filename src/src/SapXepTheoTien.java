package src;

import java.util.Comparator;

/**
 *
 * @author Nguyen Chinh
 */

public class SapXepTheoTien implements Comparator<HoaDon> {
    public int compare(HoaDon p1, HoaDon p2) {
        if (p1.tinhTien() == p2.tinhTien()) 
            return 0;
        else if (p1.tinhTien() > p2.tinhTien()) 
            return 1;
        else 
            return -1;
    }
        
}
