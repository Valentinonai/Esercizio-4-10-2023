package Esercizio1;

import Esercizio1.entities.Rectangle;

public class Main {
    public static void main(String[] args) {
        Rectangle rect1=new Rectangle(3,4);
        Rectangle rect2=new Rectangle(5,6);
        Rectangle.printRectangle(rect1);

        Rectangle.printTwoRectangles(rect1,rect2);
    }
}
