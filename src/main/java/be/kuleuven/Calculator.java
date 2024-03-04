package be.kuleuven;

public class Calculator {
    private int getal1;
    private int getal2;
    public Calculator(int getal1, int getal2) {
        this.getal1 = getal1;
        this.getal2 = getal2;
    }
    public int som(){
        return getal1+getal2;
    }
    public int aftrekken(){
        return getal1 - getal2;
    }
    public int vermenigvuldiging(){
        return getal1*getal2;
    }
    public double quotient(){
        return (double) getal1 / getal2;
    }
}
