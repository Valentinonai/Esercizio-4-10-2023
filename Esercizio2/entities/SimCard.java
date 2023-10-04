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
        boolean x=true;
        for(int i=0;i<calls.length;i++){
            if(calls[i]==null)
            {
                calls[i]=new Call(n,t);
                x=false;
                break;
            }
        }
        if(x){
            Call[] app=new Call[5];
            int cont=0;
            for(int i=1;i<calls.length;i++){
                app[cont]=calls[i];
                cont++;
            }
            app[calls.length-1]=new Call(n,t);
            System.arraycopy(app, 0, calls, 0, app.length);
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
