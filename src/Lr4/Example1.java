package Lr4;

public class Example1 {
    public static void main(String[] args) {

        int figure = 11;
        int i, j;
        for (i = 1 ; i <= figure; i++) {
            System.out.print("номер строки: " + i + " ");
            int k = 0;
            for (j = -12; j < figure; j++) {
                System.out.print("+");
                k = k + 1;
            }
            System.out.println(" Количество символов в строке " + k);
        }
    }
}
