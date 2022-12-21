package Lr3;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите 1ое целое число");
        int firstNumber = in.nextInt();
        int firstNumberWhile = firstNumber;

        System.out.println("Введите 2ое целое число");
        int secondNumber = in.nextInt();
        int secondNumberWhile = secondNumber;

        if (firstNumber < secondNumber) {
            for (; firstNumber <= secondNumber; firstNumber++) System.out.print(firstNumber + " ");
        }
        else
        {
            for (; secondNumber <= firstNumber; secondNumber++) System.out.print(secondNumber + " ");
        }

        System.out.println(" ");

        if (firstNumberWhile < secondNumberWhile) {
            while (firstNumberWhile <= secondNumberWhile){
                System.out.print(firstNumberWhile + " ");
                firstNumberWhile++;
            }
        }
        else {
            while (secondNumberWhile <= firstNumberWhile){
                System.out.print(secondNumberWhile + " ");
                secondNumberWhile++;
            }
        }
    }
}
