package org.example.parallel_stream;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.List;
import java.util.stream.Collectors;

public class parallelStreamExample1 {

    public static List<String> SequentialStreamExample(){

        long startTime = System.currentTimeMillis();
       List<String> studentActivities = StudentDatabase.getAllStudent()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

       long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequence:"+(endTime-startTime));
        return studentActivities;
    }

    public static List<String> ParallelStreamExample(){
        long startTime = System.currentTimeMillis();

        List<String> studentActivities = StudentDatabase.getAllStudent()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println("Duration to execute the pipeline in parallel:"+(endTime-startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        SequentialStreamExample();
        ParallelStreamExample();
    }
}
