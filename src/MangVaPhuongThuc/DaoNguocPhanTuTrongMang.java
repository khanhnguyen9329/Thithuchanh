package MangVaPhuongThuc;

public class DaoNguocPhanTuTrongMang {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9};
        int a = 0;
        int b = array.length - 1;
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (a < b) {
                temp = array[a];
                array[a] = array[b];
                array[b]= temp;
                a++;
                b--;

            }
            System.out.print(array[i] + ",");

        }

    }
}
