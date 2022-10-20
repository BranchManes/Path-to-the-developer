package Day4;

import java.util.Arrays;
import java.util.Random;

public class Dz42 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random r = new Random();
        int max = 0;
        int min = 10000;
        int count = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(1000);
        }
        for (int container1 : array) {
            if (container1 > max) {
                max = container1;


            }
        }
        for (int container2 : array) {
            if (container2 < min) {
                min = container2;

            }
        }
        for (int container3 : array) {
            if (container3 % 10 == 0) {
                count++;
                sum += container3;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max);
        System.out.println(min);
        System.out.println(count);
        System.out.println(sum);

    }
}