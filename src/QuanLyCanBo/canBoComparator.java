package QuanLyCanBo;

import java.util.Comparator;

public class canBoComparator implements Comparator<CanBo> {
    @Override
    public int compare(CanBo o1, CanBo o2) {
        return o1.getHoVaTen().compareTo(o2.getHoVaTen()) ;
    }
}
