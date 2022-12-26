package Lr4;

import java.util.Scanner;

public class Example8 {

    public static class encrypt {
        public static String getEncryptString(String encryptString, int shift) {
            char[] ArrayChar = encryptString.toCharArray();
            long[] ArrayInt = new long[ArrayChar.length];
            char[] ArrayCharNew = new char[ArrayChar.length];
            for (int i = 0; i< ArrayChar.length; i++)
            {
                ArrayInt[i] = ArrayChar[i] + shift;
                ArrayCharNew[i] = (char)ArrayInt[i];
            }
            encryptString = new String (ArrayCharNew);
            return encryptString;
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
