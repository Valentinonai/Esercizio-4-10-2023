package Esercizio3.entities;

import java.util.Arrays;

public class Cart {

    private Customer customer;
    private Product[] product=new Product[10];
    private double tot;

    public Cart(Customer customer)
    {
        this.customer=customer;
    }

    public void addToCart(Product p, int amount){
        if(p.getNumberOfPieces()>0){
            Esterno:
            for(int i=0;i<product.length;i++){
                if(product[i]==null){
                    for(int j=0;(j<amount) && (p.getNumberOfPieces()>0);j++){
                        product[i+j]=new Product(p.getCod(),p.getDescription(),p.getPrice(),p.getNumberOfPieces());
                        p.decreaseAmount();
                        CalcolaTot(p);
                    }
                    break Esterno;

                }
            }

        }
        else System.out.println("Prodotto "+p.getCod()+" esaurito");

    }

    private void CalcolaTot(Product p){
                this.tot=this.tot+p.getPrice();

    }

    public void printTot(){
        System.out.println("Il totale del carrello è: " + this.tot);
    }

    @Override
    public String toString() {
        return "Cart{\n" +
                "customer=" + customer +",\n"+
                "product=" + Arrays.toString(product) +",\n"+
                "tot=" + tot +"\n"+
                '}';
    }
}
