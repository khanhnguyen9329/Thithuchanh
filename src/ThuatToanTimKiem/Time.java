package ThuatToanTimKiem;

import java.util.Date;

public class Time {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Date now" + now);
        int[] arr = {1, 3, 5, 7, 9, 11, 17};
        System.out.println(nhiPhan(arr, 0, arr.length - 1, 11));
    }

    public static int nhiPhan(int[] arr, int dau, int cuoi, int giaTri) {
        int giua = (dau + cuoi) / 2;

        if (arr[giua] == giaTri) {
            return giua;
        }
        if (cuoi < dau) {
            return -1;

        }
        if (giaTri > arr[giua]) {
            return nhiPhan(arr, giua + 1, cuoi, giaTri);

        } else {
            return nhiPhan(arr, dau, giua - 1, giaTri);
        }

    }
}

