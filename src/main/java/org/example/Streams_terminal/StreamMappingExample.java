package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamMappingExample {

    public static void main(String[] args) {
       List<String> nameList = StudentDatabase.getAllStudent().stream()
                .collect(mapping(Student::getName,toList()));

        System.out.println("nameList is:"+nameList);

        Set<String> nameSet = StudentDatabase.getAllStudent().stream().collect(mapping(Student::getName,toSet()));

        System.out.println("nameSet is:"+nameSet);
    }
}
