package org.example.streams;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> Limit(List<Integer> numList){
        return numList.stream()
                .limit(2)
                .reduce((a,b) -> a + b);
    }

    public static Optional<Integer> skip(List<Integer> numList){
        return numList.stream()
                .skip(2)
                .reduce((a,b) -> a + b);
    }


    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,7,3,8,2);

        Optional<Integer> limitNum = Limit(numList);

        if(limitNum.isPresent()){
            System.out.println(limitNum.get());
        }

        Optional<Integer> skipNum = skip(numList);

        if(skipNum.isPresent()){
            System.out.println(skipNum.get());
        }

    }
}
