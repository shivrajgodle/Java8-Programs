package org.example.Lambda;

import java.util.function.Consumer;

public class lambdaVariable1 {

    public static void main(String[] args) {

        int i = 0;

        Consumer<Integer> c1 = (i1) -> {
//            int i = 2; //Not allowed
            System.out.println("Value is:-"+i);
        };

    }
}
