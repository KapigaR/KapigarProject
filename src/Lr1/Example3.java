package Lr1;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текущее название дня недели: ");
        String nameWeek = in.nextLine();

        System.out.println("Введите текущее название месяца (-я): ");
        String nameMonth = in.nextLine();

        System.out.println("Введите текущее число");
        int data = in.nextInt();

        System.out.println("Сегодня: " + nameWeek + " " + data + " " + nameMonth);
    }
}
