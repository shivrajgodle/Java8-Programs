package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {

    public static List<String> printStudentActivities(){
       return StudentDatabase.getAllStudent().stream()
               .map(Student::getActivities)
               .flatMap(List::stream)
               .distinct() // for unique data
               .sorted()
               .collect(Collectors.toList());
    }

    public static Long getNoOfStudentActivities(){
        return StudentDatabase.getAllStudent().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct() // for unique data
                .count();
    }

    public static void main(String[] args) {
        System.out.println(printStudentActivities());
        System.out.println(getNoOfStudentActivities());
    }
}
