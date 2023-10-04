package Esercizio3.entities;

public class Cart {

    private Customer customer;
    private Product[] product=new Product[10];
    private double tot;

    public Cart(Customer customer)
    {
        this.customer=customer;
    }

    public void addToCart(Product p){
        for(int i=0;i<product.length;i++){
            if(product[i]==null){
                product[i]=new Product(p.getCod(),p.getDescription(),p.getPrice(),p.getNumberOfPieces());
                break;
            }
        }
    }
}
