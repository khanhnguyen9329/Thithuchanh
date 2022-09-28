package VongLap;

public class hienthi20songuyentodautien {
    public static void main(String[] args) {
        int SNT = 2;
        int count = 0;
        while (count < 20) {
            boolean check = true;
            for (int i = 2; i < SNT; i++) {
                if (SNT % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(SNT);
                count++;


            }
            SNT++;

        }
    }

}
