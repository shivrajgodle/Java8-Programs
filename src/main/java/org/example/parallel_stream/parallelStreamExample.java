package org.example.parallel_stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class parallelStreamExample {

    public static long checkPerformanceResult(Supplier<Integer> supplier, int numberOfTimes){

        long startTime = System.currentTimeMillis();
        for(int i = 0; i < numberOfTimes;i++){
            supplier.get();
        }

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static int sum_sequential_Stream(){
        return IntStream.rangeClosed(1,100000).sum();
    }

    public static int sum_parallel_Stream(){
        return IntStream.rangeClosed(1,100000)
                .parallel()
                .sum();
    }




    public static void main(String args[]){
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println("sum_sequential_Stream is:-"+checkPerformanceResult(parallelStreamExample::sum_sequential_Stream,2000));

        System.out.println("sum_parallel_Stream is:-"+checkPerformanceResult(parallelStreamExample::sum_parallel_Stream,2000));
    }
}
