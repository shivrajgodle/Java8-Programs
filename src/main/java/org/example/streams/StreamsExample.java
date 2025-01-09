package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {

    public static void main(String[] args) {

        Predicate<Student> studentPredicate = (student -> student.getGradeLevel() >= 3);
        Predicate<Student> studentGpaPredicate = (student -> student.getGpa() >= 3.9);


        Map<String, List<String>> studentMap = StudentDatabase.getAllStudent().stream()
              .filter(studentPredicate)
                .filter(studentGpaPredicate)
              .collect(Collectors.toMap(Student::getName,Student::getActivities));
      System.out.println(studentMap);
    }
}
