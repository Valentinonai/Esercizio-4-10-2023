package Esercizio2.entities;

public class Call {
    private int telNumber;
    private int time;

    public Call(int telNumber,int time){
        this.telNumber=telNumber;
        this.time=time;
    }

    public int getTelNumber() {
        return telNumber;
    }

    public int getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Call{\n" +
                "telNumber=" + telNumber +",\n"+
                "time=" + time +"\n"+
                '}';
    }
}
