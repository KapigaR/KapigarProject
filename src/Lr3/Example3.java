package Lr3;

import java.util.Scanner;

public class Example3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество чисел");
        int numberAmount = in.nextInt();
        int numberAmountWhile = numberAmount;
        int numberOne = 0;
        int numberTwo = 1;
        int numberEq = 1;
        int numberOneWhile = 0;
        int numberTwoWhile = 1;
        int numberEqWhile = 1;


        for (;numberAmount > 0; numberAmount--)
        {
            System.out.print(numberEq + " ");
            numberEq = numberOne + numberTwo;
            numberOne = numberTwo;
            numberTwo = numberEq;
        }

        System.out.println(" ");

        while (numberAmountWhile>0)
        {
            System.out.print(numberEqWhile + " ");
            numberEqWhile = numberOneWhile + numberTwoWhile;
            numberOneWhile = numberTwoWhile;
            numberTwoWhile = numberEqWhile;
            numberAmountWhile--;
        }
    }
}
