package org.example.functionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = (s) -> s.concat("Default");

    public static void main(String[] args) {
        System.out.println("UnaryOperatorExample is:->" + unaryOperator.apply("Java8"));
    }

}
