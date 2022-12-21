package Lr3;

public class Example8 {

    public static void main(String[] args) {

        int arrAmount = 10;
        char [] alphabet = new char[arrAmount];
        int trueLetter = 0;

        for(char i = 'A';i<='Z';i++)
        {
            if (i!='A'&& i!='E'&& i!='I' && trueLetter<arrAmount) {
                alphabet[trueLetter] = i;
                trueLetter++;
            }
        }
        System.out.println(alphabet);
    }
}
