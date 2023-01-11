package Lr5;

public class Example3 {

    static class Rectangle {

        int width;
        int length;

        Rectangle() {
            System.out.println("Конструирование объекта Rectangle");
            width = 10;
            length = 5;
        }

        Rectangle(int width){
            System.out.println("Конструирование объекта Rectangle");
            this.width = width;
            length = 5;
        }

        Rectangle(int width, int length){
            System.out.println("Конструирование объекта Rectangle");
            this.width = width;
            this.length = length;
        }

        double volume(){
            return 2*(width+length);
        }
    }

    public static void main(String[] args) {

        Rectangle myRectangle = new Rectangle();
        Rectangle myRectangle1 = new Rectangle(30);
        Rectangle myRectangle2 = new Rectangle(10,10);

        double vol;

        vol = myRectangle.volume();
        System.out.println("Периметр прямоугольника равен: " + vol);

        vol = myRectangle1.volume();
        System.out.println("Периметр прямоугольника равен: " + vol);

        vol = myRectangle2.volume();
        System.out.println("Периметр прямоугольника равен: " + vol);
    }
}
