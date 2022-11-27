package Lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше число: ");
        int userNum = in.nextInt();

        var preUserNum = userNum - 1;
        var postUserNum = userNum + 1;
        var sumThreeNum = userNum + postUserNum + preUserNum;
        var powNum = Math.pow(sumThreeNum, 2);

        System.out.println("Ваша последовательность чисел: " +
                preUserNum + " " +
                userNum + " " +
                postUserNum + " " +
                powNum);
    }
}
