package com.company;

public class Calculator<T extends Number> implements SubjectToMathematicalOperations<T>{

    @Override
    public Double addUpTheNumbers(T firstT, T secondS) {
        return (firstT.doubleValue() + secondS.doubleValue());
    }

    @Override
    public Double multiplyNumbers(T firstT, T secondS) {
        return (firstT.doubleValue() * secondS.doubleValue());
    }

    @Override
    public Double subtractNumbers(T firstT, T secondS) {
        return (firstT.doubleValue() - secondS.doubleValue());
    }

    @Override
    public Double divideTheNumbers(T firstT, T secondS) {
        return (firstT.doubleValue() / secondS.doubleValue());
    }
}
