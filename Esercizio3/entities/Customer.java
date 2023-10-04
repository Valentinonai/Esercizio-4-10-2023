package Esercizio3.entities;

import java.time.LocalDate;

public class Customer {

    private int codCustomer;
    private String name;
    private String lastname;

    private String email;

    private LocalDate date=LocalDate.now();


    public Customer(int codCustomer,String name,String lastname,String email){
        this.codCustomer=codCustomer;
        this.name=name;
        this.lastname=lastname;
        this.email=email;
    }

    @Override
    public String toString() {
        return "Customer{\n" +
                "codCustomer=" + codCustomer +",\n"+
                "name='" + name + '\'' +",\n"+
                "lastname='" + lastname + '\'' +",\n"+
                "email='" + email + '\'' +",\n"+
                "date='" + date + '\'' +"\n"+
                '}';
    }
}
