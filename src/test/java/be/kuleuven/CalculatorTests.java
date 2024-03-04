package be.kuleuven;

import org.junit.jupiter.api.Test;

import static java.lang.Double.compare;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {

    @Test
    public void somVanTweeGetallen(){
        Calculator test =  new Calculator(3,5);
        assert (test.som() == 8);
    }

    @Test
    public void somNegatieveGetallen(){
        Calculator test = new Calculator(-5,-10);
        assert(test.som()==-15);
    }

    @Test
    public void aftrekkenTweePosGevallen(){
        Calculator test = new Calculator(10,5);
        assert (test.aftrekken() == 5);
    }

    @Test
    public void aftrekkenTweeNegGetallen(){
        Calculator test = new Calculator(-10,-5);
        assert (test.aftrekken() == -5);
    }

    @Test
    public void maalTweeGetallen(){
        Calculator test = new Calculator(10,10);
        assert (test.vermenigvuldiging() == 100);
    }

    @Test
    public void maalTweeNegGetallen(){
        Calculator test = new Calculator(-10, -3);
        assert (test.vermenigvuldiging() == 30);
    }

    @Test
    public void quotientTweeGetallen(){
        Calculator test = new Calculator(-10,1);
        assert (test.quotient() == -10);
    }

    @Test
    public void quotientTest3(){
        Calculator test = new Calculator(10,4);
        assertEquals(2.5, test.quotient(), 0.0001);
    }

    @Test
    public void quotientTienEnDrie(){
        Calculator test = new Calculator(10,3);
        assertEquals(3.333333333333333333 ,test.quotient(), 0.0001);
    }
}
