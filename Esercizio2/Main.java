package Esercizio2;

import Esercizio2.entities.SimCard;

public class Main {
    public static void main(String[] args) {

        SimCard sim1=new SimCard(444444444,45.34);

        sim1.setCalls(333333,560);
        sim1.setCalls(44444,23);
        sim1.setCalls(55555,55444);
        sim1.setCalls(666666,43);
        System.out.println(sim1);

    }
}
