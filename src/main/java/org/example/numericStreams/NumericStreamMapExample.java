package org.example.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class NumericStreamMapExample {

    public static List<Integer> mapToObj(){
        return IntStream.rangeClosed(1,10)
                .mapToObj((i)-> {
                    return new Integer(i);
                })
                .collect(toList());
    }

    public static long mapToLong(){
        return IntStream.rangeClosed(1,10)
                .mapToLong((i) -> i)  //convert to intStream to LongStream
                .sum();
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,10)
                .mapToDouble((i) -> i)  //convert to intStream to LongStream
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("mapToObj is:-"+mapToObj());

        System.out.println("mapToLong is:-"+mapToLong());

        System.out.println("mapToDouble is:-"+mapToDouble());
    }
}
