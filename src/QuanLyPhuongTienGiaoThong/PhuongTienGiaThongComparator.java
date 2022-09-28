package QuanLyPhuongTienGiaoThong;

import java.util.Comparator;

public class PhuongTienGiaThongComparator implements Comparator<PhuongTienGiaoThong> {

    @Override
    public int compare(PhuongTienGiaoThong o1, PhuongTienGiaoThong o2) {
        return o1.getId() - o2.getId();
    }
}
