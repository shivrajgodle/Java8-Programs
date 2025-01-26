package org.example.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

    public static Integer sumOfIntegers(List<Integer> listOfInt){
        return listOfInt.stream()
                .reduce(0,(x,y)-> x+y); // Unboxing to convert Integer to int
    }

    public static Integer sumOfIntegersIntStream(){
        return IntStream.
                rangeClosed(1,6)
                .sum();
    }


    public static void main(String[] args) {

        List<Integer> listOfInt = Arrays.asList(1,2,3,4,5,6);

        System.out.println("Sum of Integers list is:"+sumOfIntegers(listOfInt));
        System.out.println("sum Of fIntegers using IntStream is: "+sumOfIntegersIntStream());
    }
}
