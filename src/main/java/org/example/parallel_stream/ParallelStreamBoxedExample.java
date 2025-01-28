package org.example.parallel_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequentialStream(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0,(x,y)-> x + y);

        long end = System.currentTimeMillis();
        System.out.println("Duration of sequentialStream is:-"+(end-start));
        return sum;
    }

    public static int parallelStream(List<Integer> integerList){
        long start = System.currentTimeMillis();
        int sum = integerList.parallelStream()
                .reduce(0,(x,y)-> x + y);

        long end = System.currentTimeMillis();
        System.out.println("Duration of parallelStream is:-"+(end-start));
        return sum;
    }


    public static void main(String[] args) {

        List<Integer> list = IntStream.rangeClosed(1,100000)
                .boxed()
                .collect(Collectors.toList());

        sequentialStream(list);
        parallelStream(list);

    }
}
