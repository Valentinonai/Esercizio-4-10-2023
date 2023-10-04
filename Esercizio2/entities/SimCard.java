package Esercizio2.entities;

import java.util.Arrays;

public class SimCard {

    private int telNumber;
    private double credit;
    private Call[] calls=new Call[5];

    public SimCard(int telNumber,double credit){
        this.telNumber=telNumber;
        this.credit=credit;
    }

public void setCalls(int n,int t){
        for(int i=0;i<calls.length;i++){
            if(calls[i]==null)
            {
                calls[i]=new Call(n,t);

                break;
            }
        }
}
    @Override
    public String toString() {
        return "SimCard{\n" +
                "telNumber=" + telNumber +",\n"+
                "credit=" + credit +",\n"+
                "calls=" + Arrays.toString(calls) +"\n"+
                '}';
    }
}
