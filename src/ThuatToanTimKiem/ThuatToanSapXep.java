package ThuatToanTimKiem;

public class ThuatToanSapXep {
    public static void main(String[] args) {
        int[] array = {4, 6, 8, 3, 9, 20, 1, 0};

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
            System.out.println(array[i]);
        }


        int pos;
         int  x;
        for (int i = 1; i < array.length; i++) { //đoạn array[0] đã sắp xếp
            x = array[i];
            pos = i;
            while (pos > 0 && x < array[pos - 1]) {
                array[pos] = array[pos - 1]; // đổi chỗ
                pos--;
            }
            array[pos] = x;
        }

    }
}
