package test.java;

import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class rombtest {
     Romb romb;
    @BeforeTest
    public void setUp() {
        this.romb = new Romb();
    }

    @Test
    public void testCalcMinus_minus30_35() {
        double actual = this.romb.calcRadius(30, 35);
        double expected = 516.22;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test
    public void testCalcMinusangle_48_minus36() {
        double actual = this.romb.calcRadius(48, 36);
        double expected = 1354.26;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalc_Zero_Side() {
        this.romb.calcRadius(0, 40);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalc_Zero_Angle() {
        this.romb.calcRadius(1, 0);
    }
    
    @Test
    public void testCalcKerulet(){
        double actual =this.romb.calcKerulet(40);
        double expected=160;
        Assert.assertEquals(actual, expected, 0.1);
    }

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcTeruletZero(){
        this.romb.calcKerulet(0);

    }

}
