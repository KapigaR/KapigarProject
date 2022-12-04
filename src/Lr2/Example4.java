package Lr2;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int num = in.nextInt();

        if (num>4 && num<11)
        {
            System.out.println("Верное число");
        }
        else
        {
            System.out.println("Неверное число");
        }
    }
}
