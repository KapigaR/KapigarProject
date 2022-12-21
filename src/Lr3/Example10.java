package Lr3;

import java.util.Arrays;
import java.util.Collections;

public class Example10 {

    public static void main(String[] args) {

        int arrValue = 15;
        Integer [] randomArray = new Integer [arrValue];

        for (int i=0;i<randomArray.length;i++) {
            randomArray[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray, Collections.reverseOrder());

        for (int values : randomArray) {
            System.out.print(values + " ");
        }
    }
}
