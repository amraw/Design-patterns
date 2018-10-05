package StrategyPattern;

public class DivisionOperation implements Operation {
    @Override
    public int doOperation(int num1, int num2) {
        if(num2 == 0) throw new ArithmeticException("Divide by zero");
        return num1/num2;
    }
}
