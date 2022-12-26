package Lr4;

import java.util.Arrays;

public class Example3 {

    public static void main(String[] args) {

        int [][] firstArray =  {{2,2,2},{2,2,2}};

        Arrays.stream(firstArray).map(Arrays::toString).forEach(System.out::println);
    }
}
