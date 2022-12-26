package Lr4;

public class Example2 {

    public static void main(String[] args) {

        int length = 5; //высота треугольника
        int amount = 0;
        for (int i = 0;i<length;i++) {
            amount++;
            for (int j = 0; j<amount;j++) {
                System.out.print("+");
            }
            System.out.println(" ");
        }

    }
}
