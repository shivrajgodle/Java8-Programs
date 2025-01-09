package org.example.Lambda;

import java.util.function.Consumer;

public class lambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {


        Consumer<Integer> c1 = (i) -> {
            value++;
            System.out.println(value + i);
        };

        c1.accept(4);
    }
}
