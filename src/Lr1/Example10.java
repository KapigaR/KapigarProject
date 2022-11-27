package Lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Напиши число номер 1: ");
        double firstNum = in.nextDouble();

        System.out.println("Теперь число номер 2: ");
        double secondNum = in.nextDouble();

        var sumNum = firstNum + secondNum;
        var difNum = firstNum - secondNum;

        System.out.println("Сумма этих чисел равна: " + sumNum);
        System.out.println("Разность этих чисел равна: " + difNum);
    }
}
