package Lr1;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();

        System.out.println("Вас зовут: " + name + " и вам " + age + " лет.");
    }
}
