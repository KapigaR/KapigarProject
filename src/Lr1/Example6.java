package Lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String userName = in.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int userYear = in.nextInt();

        Calendar cal = Calendar.getInstance();
        int actualYears = cal.get(Calendar.YEAR);

        int measureYear = actualYears - userYear;

        System.out.println("Приветствую " + userName + ". Вам: " + measureYear + " лет");
    }
}
