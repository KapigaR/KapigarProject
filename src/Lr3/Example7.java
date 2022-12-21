package Lr3;

public class Example7 {

    public static void main(String[] args) {

        int arrAmount = 10;  // >0 && <14
        char [] alphabet = new char[arrAmount];
        int alphabetNum = 0;
        int trueLetter = 0;

        for(char i = 'a';i<='z';i++)
        {
            alphabetNum++;
            if (alphabetNum%2!=0 && trueLetter<arrAmount) {
                alphabet[trueLetter] = i;
                trueLetter++;
            }
        }
        System.out.println(alphabet);

        for (int i = 0; i < alphabet.length / 2; i++) {
            char symbol = alphabet[i];
            alphabet[i] = alphabet[alphabet.length - i - 1];
            alphabet[alphabet.length - i - 1] = symbol;
        }
        System.out.println(alphabet);
    }
}
