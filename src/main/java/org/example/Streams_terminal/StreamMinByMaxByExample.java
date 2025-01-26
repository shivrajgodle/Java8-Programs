package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class StreamMinByMaxByExample {

    public static Optional<Student> minBy_example(){
        return StudentDatabase.getAllStudent()
                .stream()
                .collect(minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy_example(){
        return StudentDatabase.getAllStudent().stream()
                .collect(maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println(minBy_example());

        System.out.println(maxBy_example());
    }
}
