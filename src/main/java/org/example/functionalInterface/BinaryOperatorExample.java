package org.example.functionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> comparator = (a,b) -> a.compareTo(b);

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
        System.out.println("binaryOperator is:-"+binaryOperator.apply(3,4));

        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println("maxBy is:-"+maxBy.apply(3,5));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println("minBy is:-"+minBy.apply(3,5));

    }
}
