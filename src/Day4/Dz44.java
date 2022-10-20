package Day4;

import java.util.Arrays;
import java.util.Random;

public class Dz44 {
    public static void main(String[] args) {
        Random r = new Random();
        int maxSum = 0;
        int maxSumIndex = 0;
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10000);
        }
        /*  for (int i = 0; i < array.length - 2; i++) {
            sum = array[i] + array[i + 1] + array[i + 2];
            if (sum > maxSum) {
                maxSum = sum;
                maxSumIndex = i;
            }
        } *///первый вариант решения

         for(int i=0;i<array.length-2;i++){ //второй вариант решения
             int sum = 0;
             for(int j=i;j<i+3;j++) {
                 sum += array[j];
             }
                 if(sum>maxSum){
                     maxSum = sum;
                     maxSumIndex =i;
                 }

         }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Сумма элементов найденной тройки: " + maxSum);
        System.out.println("Индекс первого элемента числа: " + maxSumIndex);


    }
}