package MangVaPhuongThuc;

public class DungHamTimSNTtrongMang {
    public static boolean check(int x) {
        if (x < 2) {
            return false;
        }
        if (x == 2) {
            return true;
        }
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;

            }

        }
        return true;

    }

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 6, 7, 8, 11, 13,16,19,20,21,23};
        for (int i = 0; i < array.length; i++) {
            if(check(array[i])){
                System.out.println(array[i]);

            }
        }
    }
}
