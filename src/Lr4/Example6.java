package Lr4;

import java.util.Random;

public class Example6 {

    public static void main(String[] args) {

        int rowIn = 4; // изменяемая переменная
        int columnIn = 5; // изменяемая переменная
        int row = 0;
        int column = 0;
        int [][] randomIntArr = new int[rowIn][columnIn];
        int [][] calcIntArr = new int[rowIn-1][columnIn-1];

        Random rnd = new Random();

        int rndRow = rnd.nextInt(rowIn);
        int rndColumn = rnd.nextInt(columnIn);

        for (int i = 0; i<randomIntArr.length;i++){
            for (int j = 0;j<randomIntArr[i].length;j++) {
                randomIntArr[i][j] = rnd.nextInt(10) + 1;
            }
        }

        System.out.println("Индекс ряда " + rndRow);
        System.out.println("Индекс колонки " + rndColumn);
        System.out.println(" ");

        for (int i = 0; i<randomIntArr.length;i++,System.out.println()){
            for (int j = 0; j<randomIntArr[i].length;j++){
                if (j!=rndColumn && i!=rndRow){
                    calcIntArr[row][column] = randomIntArr[i][j];
                    column++;
                }
                System.out.print(randomIntArr[i][j]+" ");
            }
            if (i!=rndRow) {
                row++;
            }
            column=0;
        }

        System.out.println(" ");

        for (int i=0;i < calcIntArr.length;i++,System.out.println()){
            for (int j=0;j<calcIntArr[i].length;j++){
                System.out.print(calcIntArr[i][j] + " ");
            }
        }
    }
}
