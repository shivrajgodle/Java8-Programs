package org.example.Streams_terminal;

import org.example.data.StudentDatabase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;

public class StreamsCountingExample {

    public static long count(){
        return StudentDatabase.getAllStudent()
                .stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(counting());
    }

    public static void main(String[] args) {
        System.out.println(count());
    }

}
