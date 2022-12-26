package Lr4;

import java.util.Random;

public class Example5 {

    public static void main(String[] args) {

        int raw = 5;
        int column = 3;
        int [][] randomIntArr = new int[column][raw];
        int [][] reversIntArr = new int[raw][column];

        Random rnd = new Random();
        for (int i=0;i < randomIntArr.length;i++) {
            for (int j=0;j < randomIntArr[i].length;j++) {
                randomIntArr[i][j]=rnd.nextInt(100) + 1;
            }
        }
        for (int i=0;i < randomIntArr.length;i++,System.out.println()) {
            for (int j=0;j < randomIntArr[i].length;j++) {
                System.out.print(randomIntArr[i][j]+" ");
            }
        }

        System.out.println(" ");

        for (int i=0;i < reversIntArr.length;i++,System.out.println()){
            for (int j=0;j<reversIntArr[i].length;j++){
                reversIntArr[i][j]=randomIntArr[j][i];
                System.out.print(reversIntArr[i][j] + " ");
            }
        }
    }
}
