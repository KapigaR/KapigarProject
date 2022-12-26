package Lr4;

import java.util.Scanner;

public class Example8 {

    public static class encrypt {
        public static String getEncryptString(String encryptString, int shift) {
            char[] ArrayChar = encryptString.toCharArray(); // преобразуем переданную в метод строку в символьный массив
            long[] ArrayInt = new long[ArrayChar.length]; // создаем массив с типом данных long, размер массива равен размеру символьного массива
            char[] ArrayCharNew = new char[ArrayChar.length]; // создаем символьный массив в который будем записывать преобразованные символы
            //в цикле перебираем все символы из которых состоит переданная нами строка и прибавляем к ним число, ключ (сдвиг)
            for (int i = 0; i< ArrayChar.length; i++)
            {
                ArrayInt[i] = ArrayChar[i] + shift; // прибавляем к символу с индексом i сдвиг
                ArrayCharNew[i] = (char)ArrayInt[i]; // преобразовываем число в символ char и записываем на нужное место в новый массив
            }
            encryptString = new String (ArrayCharNew); // преобразовываем новый массив символов в строку
            return encryptString; // возвращаем строку в метод из которого был вызван текущий метод
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите текст для шифрования: ");
        String userText = in.nextLine();

        System.out.println("Введите ключ");
        int userKey = in.nextInt();

        String codeText = encrypt.getEncryptString(userText, userKey);
        System.out.println("Текст после преобразования: " + codeText);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        boolean again = false;

        while (!again) {
            String answer = in.next();
            switch (answer){
                case "y":
                    System.out.println(userText);
                    again = true;
                    break;
                case "n":
                    System.out.println("До свидания!");
                    again = true;
                    break;
                default:
                    System.out.println("Введите корректный ответ");
            }
        }
    }
}
