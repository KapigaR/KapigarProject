package Lr5;

public class Example2 {

     static class WorkChar {

       char firstSymbol = 'A';
       char secondSymbol = 'D';

        public char[] tablet() {
            int i = (int)secondSymbol - (int)firstSymbol + 1;
            char [] tabletSymbol = new char[i];
            char symbol = firstSymbol;
            for (int j = 0; symbol>=firstSymbol && symbol<=secondSymbol;j++) {
                tabletSymbol[j] = symbol;
                symbol++;
            }
            return tabletSymbol;
        }

    }

    public static void main(String[] args) {

        WorkChar newChar = new WorkChar();
        System.out.println(newChar.tablet());
    }
}
