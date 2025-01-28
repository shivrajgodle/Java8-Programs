package org.example.parallel_stream;

import java.util.stream.IntStream;

public class SumClient {

    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(0,1000)
                .parallel()
                .forEach(sum::performSum);

        //500500
        //485602
        //495913
        System.out.println(sum.getTotal());
    }
}
