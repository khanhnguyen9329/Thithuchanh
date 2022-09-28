package MangVaPhuongThuc;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 7};
        int a[] = new int[10];
        int vitrixoa = 3;
        for (int i = 0; i < array.length; i++) {
            a[i] = array[i];
        }
//        a[array.length] = 8;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
        for (int i = array.length; i > vitrixoa; i--) {
            a[i] = a[i - 1];

        }
        a[vitrixoa] = 29;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }
    }

}






