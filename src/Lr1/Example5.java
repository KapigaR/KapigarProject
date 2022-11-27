package Lr1;

import java.util.Calendar;
import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш год рождения: ");
        int userYear = in.nextInt();

        Calendar cal = Calendar.getInstance();
        int actualYears = cal.get(Calendar.YEAR);

        int measureYear = actualYears - userYear;

        System.out.println("Вам: " + measureYear + " лет");
    }
}
