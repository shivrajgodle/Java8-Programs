package org.example.numericStreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangesExample {

    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1,50);
        System.out.println("IntStream range count:-"+intStream.count());
        IntStream.range(1,50).forEach(i -> System.out.print(i));

        System.out.println();

        IntStream intStreamRange = IntStream.rangeClosed(1,50);
        System.out.println("IntStream rangeClosed count:-"+intStreamRange.count());
        IntStream.rangeClosed(1,50).forEach(val -> System.out.print(val));


        System.out.println();

        LongStream longStreamRange = LongStream.rangeClosed(1,50);
        System.out.println("LongStream rangeClosed count:-"+longStreamRange.count());
        LongStream.rangeClosed(1,50).forEach(val -> System.out.print(val));

        System.out.println();



        IntStream.rangeClosed(1,50).asDoubleStream().forEach(val -> System.out.print(val));


    }
}
