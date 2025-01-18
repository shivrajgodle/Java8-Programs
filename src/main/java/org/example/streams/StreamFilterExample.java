package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

    public static List<Student> getFilterStudentByGender(){
        return StudentDatabase.getAllStudent().stream()
                .filter((student)-> student.getGender().equals("female"))
                .filter((student)-> student.getGpa() >= 3.8)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        getFilterStudentByGender().forEach(System.out::println);

    }

}
