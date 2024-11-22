package calculator;

public class ConcreteStrategyDivide implements Strategy {
    @Override
    public double execute(double a, double b) {return a / b;}
}
