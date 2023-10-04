package Esercizio3.entities;

public class Product {

    private int cod;
    private String description;
    private double price;
    private int numberOfPieces;

    public Product(int cod,String description,double price,int numberOfPieces){
        this.cod=cod;
        this.description=description;
        this.price=price;
        this.numberOfPieces=numberOfPieces;
    }

    public int getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getNumberOfPieces() {
        return numberOfPieces;
    }

    public void decreaseAmount(){
        this.numberOfPieces--;
    }
    @Override
    public String toString() {
        return "Product{\n" +
                "cod=" + cod +",\n"+
                "description='" + description + '\'' +",\n"+
                "price=" + price +",\n"+
                "numberOfPieces=" + numberOfPieces +"\n"+
                '}';
    }
}
