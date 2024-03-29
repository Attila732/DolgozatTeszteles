package zold.lan;

import java.util.InputMismatchException;

public class romb {
    public double calcRadius(double sideA, double angle) {
        if (sideA <= 0 || angle <= 0) {
            throw new InputMismatchException();
        }
        return Math.pow(sideA, 2) * Math.sin(angle);
    }
}
