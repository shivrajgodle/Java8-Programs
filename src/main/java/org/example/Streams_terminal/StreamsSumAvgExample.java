package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.stream.Collectors;

import static java.util.stream.Collectors.averagingInt;
import static java.util.stream.Collectors.summingInt;

public class StreamsSumAvgExample {

    public static int sum(){
        return StudentDatabase.getAllStudent()
                .stream()
                .collect(summingInt(Student::getNoteBooks));
    }

    public static Double average(){
        return StudentDatabase.getAllStudent()
                .stream()
                .collect(averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("sum of notebook is:-"+sum());
        System.out.println("average of notebook is:-"+average());
    }

}
