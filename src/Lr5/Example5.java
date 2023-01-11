package Lr5;

public class Example5 {

    static class OneToOneH {

        private int userNum;

        public void Set(int userNum) {
            if (userNum>100) userNum = 100;
            this.userNum = userNum;
        }

        public void Set0(){
            userNum = 0;
        }

        OneToOneH(){
            userNum = 0;
        }

        OneToOneH(int userNum){
            if (userNum>100) userNum = 100;
            this.userNum = userNum;
        }

        public void Out(){
            System.out.println("Значение поля: " + userNum);
        }

    }

    public static void main(String[] args) {

        OneToOneH myOne = new OneToOneH();
        myOne.Out();

        OneToOneH myOne1 = new OneToOneH(74);
        myOne1.Out();

        myOne.Set(56);
        myOne.Out();

        myOne.Set0();
        myOne.Out();

        myOne.Set(121);
        myOne.Out();
    }
}
