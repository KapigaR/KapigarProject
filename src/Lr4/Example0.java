package Lr4;

public class Example0 {

    public static void main(String[] args) {

        int figure = 10;
        int i ;
        int j ;
        int k;
        for (i = 1 ; i <= figure; i++){
            System.out.print("номер строки: " + i + " ");
            k = 0;
            for (j = -5; j < figure; j++){
                System.out.print("+");
                k = k + 1;
            }
            System.out.println(" Количество символов в строке " + k);

        }
    }
}
