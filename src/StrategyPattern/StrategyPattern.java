package StrategyPattern;

public class StrategyPattern {
    private Operation strategy;

    public StrategyPattern(Operation strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.doOperation(num1,num2);
    }
}
