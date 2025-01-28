package org.example.Streams_terminal;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamGroupingByExample {

    public static void groupStudentsGender(){
        Map<String, List<Student>> studentList = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy(Student::getGender));

        System.out.println("studentList is:-"+studentList);
    }

    public static void customizedGroupingExample(){
        Map<String, List<Student>> customizedStudentList = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy((student)-> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println("customizedStudentList is:-"+customizedStudentList);
    }

    public static void twoLevelGrouping_1(){
       Map<Integer,Map<String,List<Student>>>  twoLevelGrouping1 = StudentDatabase.getAllStudent()
                .stream()
                .collect(
                        groupingBy(Student::getGradeLevel,
                        groupingBy(student-> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE" )));

        System.out.println("twoLevelGrouping1 is:-"+twoLevelGrouping1);
    }

    public static void twoLevelGrouping_2(){
        Map<String,Integer>  twoLevelGrouping1 = StudentDatabase.getAllStudent()
                .stream()
                .collect(
                        groupingBy(Student::getName,
                                summingInt(Student::getNoteBooks)));

        System.out.println("twoLevelGrouping1 is:-"+twoLevelGrouping1);
    }

    public static void threeArgumentGroupBy(){
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new,toSet()));
        System.out.println("studentLinkedHashMap is:-"+studentLinkedHashMap);
    }


    public static void calculateTopGpa(){
      Map<Integer,Optional<Student>> studentMapOptional = StudentDatabase.getAllStudent()
              .stream()
              .collect(groupingBy(Student::getGradeLevel,maxBy(Comparator.comparing(Student::getGpa))));


        //System.out.println("studentMapOptional is:-"+studentMapOptional);

        Map<Integer,Student> withoutOptionalstudentMap = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)),Optional::get)));


        System.out.println("withoutOptionalstudentMap is:-"+withoutOptionalstudentMap);
    }

    public static void calculateMinGpa(){
        Map<Integer,Optional<Student>> studentMapOptional = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,minBy(Comparator.comparing(Student::getGpa))));


        //System.out.println("studentMapOptional is:-"+studentMapOptional);

        Map<Integer,Student> withoutOptionalstudentMap = StudentDatabase.getAllStudent()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,collectingAndThen(minBy(Comparator.comparing(Student::getGpa)),Optional::get)));


        System.out.println("withoutOptionalstudentMap is:-"+withoutOptionalstudentMap);
    }


    public static void main(String[] args) {
        //groupStudentsGender();
        //customizedGroupingExample();
//        twoLevelGrouping_1();
       // twoLevelGrouping_2();
        //threeArgumentGroupBy();

        //calculateTopGpa();
        calculateMinGpa();
    }
}
