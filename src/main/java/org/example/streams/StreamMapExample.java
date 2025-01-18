package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static List<String> namesList(){
        return StudentDatabase.getAllStudent().stream()
                .map((Student::getName))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static Set<String> namesSet(){
        return StudentDatabase.getAllStudent().stream()
                .map((Student::getName))
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }


    public static void main(String args[]){
        System.out.println(namesList());
        System.out.println(namesSet());
    }

}
