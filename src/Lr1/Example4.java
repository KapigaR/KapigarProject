package Lr1;

import java.util.Scanner;

public class Example4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Введите число дней в данном месяце: ");
        int days = in.nextInt();

        System.out.println("В месяце " + month + ": " + days + " дней");
    }
}
