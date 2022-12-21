package Lr3;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Example6 {

    public static void main(String[] args) throws IOException {

        int number = 0;
        int localNum = 0;
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        try {
            number= Integer.parseInt(str);
        }
        catch (NumberFormatException a){
            System.out.println("неверное значение");
            exit(0);
        }
        int [] array = new int[number];

        for (int i = 0; i< array.length;){
            localNum = localNum+1;
            if (localNum%5==2){
                array[i] = localNum;
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
