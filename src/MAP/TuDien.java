package MAP;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TuDien {
    Map<String, String> duLieu = new TreeMap<String, String>();

    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa, yNghia);
    }

    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }
    public String traTu(String tuKhoa){
        String yNGhia= this.duLieu.get(tuKhoa);
        return yNGhia;
    }
    public void inTuKhoa(){
        Set<String> tapHopTuKhoa = this.duLieu.keySet();
        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    public int soLuong(){
        return this.duLieu.size();
    }
    public void xoaTatCa(){
       this.duLieu.clear();
    }


}
