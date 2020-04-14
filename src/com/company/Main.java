package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("результат сочитания 5 и 6 = " + (new Calculator<Double>().addUpTheNumbers(5D, 6D)));
        System.out.println("результат умножения 5 на 6 = " + new Calculator<Integer>().multiplyNumbers(5, 6));
        System.out.println("результат вычитанния 5 из 6 = " + new Calculator<Float>().subtractNumbers(5F, 6F));
        System.out.println("результат деления 5 на 6 = " + new Calculator<Double>().divideTheNumbers(5D, 6D));


    }
}