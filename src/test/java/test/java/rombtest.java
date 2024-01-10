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

    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcMinus_minus30_35() {
        double actual = this.romb.calcRadius(-30, 35);
        double expected = 385.36;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalcMinusangle_48_minus36() {
        double actual = this.romb.calcRadius(48, -36);
        double expected = 2285.05;
        Assert.assertEquals(actual, expected, 1);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalc_Zero_Side() {
        this.romb.calcRadius(0, 40);
    }
    @Test(expectedExceptions = InputMismatchException.class)
    public void testCalc_Zero_Angle() {
        this.romb.calcRadius(1, 0);
    }
}
