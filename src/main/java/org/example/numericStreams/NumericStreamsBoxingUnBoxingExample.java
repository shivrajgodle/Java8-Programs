package org.example.numericStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnBoxingExample {

    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,10)
                //int
                .boxed()
                //Integer
                .collect(Collectors.toList());
    }

    public static int unBoxing(List<Integer> listOfInteger){
        //wrapper to primitive
       return listOfInteger.stream()
                // wrapper Integer value
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());

        List<Integer> integerList = boxing();
        System.out.println(unBoxing(integerList));
    }
}
