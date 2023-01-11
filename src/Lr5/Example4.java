package Lr5;

public class Example4 {

    static class NumCodeReader {

        int wholePartNum;
        char codeNum;
        double userNum;

        NumCodeReader(double userNum) {

            this.userNum = userNum;
            wholePartNum = (int)userNum;
            double finalRes = (userNum-wholePartNum)*100;

            System.out.println("Целочисленное поле имеет значение: " + ((int)finalRes));

            codeNum = (char) wholePartNum;
            System.out.println("Символьное поле имеет значение: " + codeNum);
            System.out.println("Код символа: " + wholePartNum);
        }
    }

    public static void main(String[] args) {

    NumCodeReader numCode = new NumCodeReader(65.1248);
    }
}
