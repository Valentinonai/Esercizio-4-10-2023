package Esercizio3.entities;

public class Customer {

    private int codCustomer;
    private String name;
    private String lastname;

    private String email;

    private String date;


    public Customer(int codCustomer,String name,String lastname,String email,String date){
        this.codCustomer=codCustomer;
        this.name=name;
        this.lastname=lastname;
        this.email=email;
        this.date=date;
    }



}
