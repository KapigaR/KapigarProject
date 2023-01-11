package Lr5;

public class Example1 {

    static class WorkSymbol {

        private char symbol;

        public void Set(char symbol) {
            this.symbol = symbol;
        }

        public int ReturnCodeSymbol() {
            return symbol;
        }

        public void ShowSymbol() {
            System.out.println("Значение поля: " + symbol);
        }
    }
    public static void main(String[] args) {

        WorkSymbol symbol = new WorkSymbol();
        symbol.Set('l');
        symbol.ShowSymbol();
        System.out.println("Код данного символа: " + symbol.ReturnCodeSymbol());
    }
}
