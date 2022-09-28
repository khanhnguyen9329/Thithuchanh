package MangVaPhuongThuc;

public class TimMaxTrongMang2Chieu {
    public static void main(String[] args) {

        int array[][] = {
                {1, 3, 5, 7, 9},
                {2, 4, 6, 8, 10}
        };
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(max <array[i][j]){
                    max = array[i][j];
                }
            }

        }
            System.out.println(max);


    }

}
