package org.example.streams;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

    public static Integer getMultiplicationReduce(List<Integer> integerList){
        return integerList.stream()
                .reduce(1,(a,b)-> a * b);
    }

    public static Optional<Integer> getMultiplicationReduceWithoutIdentity(List<Integer> integerList){
        return integerList.stream().reduce((a,b) -> a * b);
    }

    public static Optional<Student> getHighestStudentGpaList(){
       return StudentDatabase.getAllStudent().stream().reduce((s1,s2)-> s1.getGpa() > s2.getGpa() ? s1 : s2);
    }

    public static void main(String[] args) {
        List<Integer> Integers = Arrays.asList(3,5,7);
        System.out.println(getMultiplicationReduce(Integers));

        List<Integer> Integers1 = Arrays.asList(3,5,7);
        List<Integer> Integers2 = new ArrayList<>();

        Optional<Integer> result = getMultiplicationReduceWithoutIdentity(Integers1);

        System.out.println(result.isPresent());
        if(result.isPresent()){
            System.out.println(result.get());
        }

        Optional<Student> student = getHighestStudentGpaList();

        if(student.isPresent()){
            System.out.println(student.get());
        }

    }
}
