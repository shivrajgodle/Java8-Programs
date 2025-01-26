package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class StreamsJoiningExample {

    public static String Joining_1(){
        return StudentDatabase.getAllStudent()
                .stream()
                .map((Student::getName))
                .collect(joining());
    }

    public static String Joining_2(){
        return StudentDatabase.getAllStudent()
                .stream()
                .map((Student::getName))
                .collect(joining("-"));
    }

    public static String Joining_3(){
        return StudentDatabase.getAllStudent()
                .stream()
                .map((Student::getName))
                .collect(joining("-","(",")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining_1 is:-"+Joining_1());

        System.out.println("Joining_2 is:-"+Joining_2());

        System.out.println("Joining_3 is:-"+Joining_3());
    }

}
