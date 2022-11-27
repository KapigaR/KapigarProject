package Lr1;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите Фамилию: ");
        String surname = in.nextLine();

        System.out.println("Введите Имя: ");
        String name = in.nextLine();

        System.out.println("Введите Отчество: ");
        String middleName = in.nextLine();

        System.out.println("Hello " + surname + " " + name + " " + middleName);
    }
}