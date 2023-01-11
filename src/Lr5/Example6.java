package Lr5;

public class Example6 {

    static class Compare {

        private int min = 0;
        private int max = 0;
        int transitVar;

        public void CompareClass(int min, int max){
            if (min>max){
                transitVar = max;
                max = min;
                min = transitVar;
            }
            this.min = min;
            this.max = max;
        }

        public void CompareClass(int transitVar){
            if (transitVar<max) {
                min = transitVar;
            }
            else {
                max = transitVar;
            }
        }

        Compare(int min, int max){
            if (min>max){
            transitVar = max;
            max = min;
            min = transitVar;
            }
            this.min = min;
            this.max = max;
        }
        Compare(int transitVar){
            if (transitVar<max) {
                min = transitVar;
            }
            else {
                max = transitVar;
            }
        }

        public void Out(){
            System.out.println("Минимальное значение: " + min + " Максимальное значение: " + max);
        }
    }

    public static void main(String[] args) {

        Compare myComp = new Compare(7,10);
        myComp.Out();

        Compare myComp1 = new Compare(6);
        myComp1.Out();

        Compare myComp2 = new Compare(0);
        myComp2.CompareClass(0);
        myComp2.Out();

        Compare myComp3 = new Compare(0);
        myComp3.CompareClass(6,3);
        myComp3.Out();
    }
}
