package Lr3;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");

        int userNumber = in.nextInt();

        switch (userNumber) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Ошибка, вы вышли за допустимый диапозон чисел");
        }
    }
}
