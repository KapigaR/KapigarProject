package Lr3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Example5 {

    public static void main(String[] args) throws IOException {

        System.out.println("Введите несколько чисел через пробел (или не пробел)");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        reader.close();
        int sum = 0;
        int newArray = 0;

        String[] splitStr = str.split("\\D+");

        int [] arr = new int[splitStr.length];

        for (int i = 0; i < arr.length; i++){
                arr[i] = Integer.parseInt(splitStr[i]);
            if ((arr[i] % 5 == 2) || (arr[i] % 3 == 1)) newArray++;
        }

        int[] newArr = new int[newArray];
        int j = 0;

        for (int k : arr) {
            if ((k % 5 == 2) || (k % 3 == 1)) {
                newArr[j] = k;
                j++;
                sum = sum + k;
            }
        }
        System.out.println(Arrays.toString(newArr) + " " + sum);
    }
}
