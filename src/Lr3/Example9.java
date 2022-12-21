package Lr3;

import java.util.Arrays;

public class Example9 {

    public static void main(String[] args) {

        int arrValue = 10;
        int [] randomArray = new int [arrValue];
        int indexOfMin;

        for (int i=0;i<randomArray.length;i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }

        System.out.println(Arrays.toString(randomArray));

        int min = randomArray[0];
        for (int num : randomArray) {
            if (num < min) {
                min = num;
            }
        }

        System.out.println("Минимальное значение: " + min);

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] == min) {
                indexOfMin = i;
                System.out.println("Индекс: " + indexOfMin);
            }
        }
    }
}
