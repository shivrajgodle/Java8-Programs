package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

public class StreamsPartitioningExample {

    public static void partitioningBy_1(){

        Predicate<Student> studentPredicate = (student) -> student.getGpa() >= 3.8;

        Map<Boolean, List<Student>> gpaPredicate = StudentDatabase.getAllStudent()
                .stream()
                .collect(partitioningBy(studentPredicate));
        System.out.println("gpaPredicate is:-"+gpaPredicate);
    }

    public static void partitioningBy_2(){

        Predicate<Student> studentPredicate = (student) -> student.getGpa() >= 3.8;

        Map<Boolean, Set<Student>> gpaPredicate = StudentDatabase.getAllStudent()
                .stream()
                .collect(partitioningBy(studentPredicate,toSet()));
        System.out.println("gpaPredicate is:-"+gpaPredicate);
    }

    public static void main(String[] args) {
//        partitioningBy_1();
        partitioningBy_2();
    }



}
