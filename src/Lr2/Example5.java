package Lr2;

import java.util.Scanner;

public class Example5 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int num = in.nextInt();

        if (num<0)
        {
        num=num*-1;
        }

        char[] array;
        array = String.valueOf(num).toCharArray();
        int arrayNum = array.length-4;
        System.out.println(array[arrayNum] + " тысяч в этом числе.");
    }
}
