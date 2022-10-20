package Day4;

import java.util.Arrays;
import java.util.Random;

public class Dz43 {
    public static void main(String[] args) {
        int[][] array = new int[8][12];
        Random r = new Random();
        int maxSum = 0;
        int numberIndex = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = r.nextInt(50);
            }
        }
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                numberIndex = i;
            }

        }
        System.out.println(Arrays.deepToString(array));
        System.out.println(maxSum);
        System.out.println(numberIndex);

    }
}
