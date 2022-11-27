package Lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Привет, это складыватель двух чисел. Напиши число номер 1: ");
        double firstNum = in.nextDouble();

        System.out.println("Теперь число номер 2: ");
        double secondNum = in.nextDouble();

        var measureNum = firstNum + secondNum;

        System.out.println("Сумма этих двух чисел равна: " + measureNum);
    }
}
