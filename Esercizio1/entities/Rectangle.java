package Esercizio1.entities;

import org.w3c.dom.css.Rect;

public class Rectangle {

    private double height;
    private double width;

    public Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }

    public void printSides(){
        System.out.println("height: "+ this.height+" width: "+this.width);
    }
    public double perimetro(){
        return (this.height*2)+(this.width*2);
    }
    public double area(){
        return this.height*this.width;
    }

    static public void printRectangle(Rectangle rect){
        rect.printSides();
        System.out.println("area: "+ rect.area() +"\n"+"perimetro: "+rect.perimetro());
    }
    static public void printTwoRectangles(Rectangle rect1, Rectangle rect2){
        rect1.printSides();
        System.out.println("area: "+ rect1.area() +"\n"+"perimetro: "+rect1.perimetro());
        rect2.printSides();
        System.out.println("area: "+ rect2.area() +"\n"+"perimetro: "+rect2.perimetro());
        System.out.println("La somma dell'area dei due rettangoli è: "+(rect1.area()+rect2.area()) );
        System.out.println("La somma del perimetro dei due rettangoli è: "+ (rect1.perimetro()+rect2.perimetro()));
    }
}
