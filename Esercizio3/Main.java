package Esercizio3;

import Esercizio3.entities.Cart;
import Esercizio3.entities.Customer;
import Esercizio3.entities.Product;

public class Main {
    public static void main(String[] args) {

        Customer custumer1=new Customer(1,"pippo","rossi","ppppp@ddd.ddd");
        Customer custumer2=new Customer(2,"pluto","verdi","iiiii@kkkkk.llll");

        Product product1=new Product(1,"pppppp",23,10);
        Product product2=new Product(2,"oooooo",50,8);
        Product product3=new Product(3,"iiiiii",66,23);
        Product product4=new Product(4,"uuuuuu",3,0);

        Cart cart1=new Cart(custumer1);
        Cart cart2=new Cart(custumer2);

        cart1.addToCart(product1,2);
        cart1.addToCart(product3,1);
        cart1.addToCart(product4,1);
        cart2.addToCart(product2,9);
        cart2.addToCart(product1,1);

        cart1.printTot();
        cart2.printTot();

        System.out.println("cart1:\n"+cart1);
        System.out.println("--------------");
        System.out.println("cart2:\n"+cart2);

        System.out.println("Product1 amount: "+product1.getNumberOfPieces());
        System.out.println("Product2 amount: "+product2.getNumberOfPieces());
        System.out.println("Product3 amount: "+product3.getNumberOfPieces());
        System.out.println("Product4 amount: "+product4.getNumberOfPieces());
    }
}
