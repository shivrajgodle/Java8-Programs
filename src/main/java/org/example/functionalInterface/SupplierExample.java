package org.example.functionalInterface;

import org.example.data.Student;
import org.example.data.StudentDatabase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> supplier = () -> {
            return new Student("James",4,3.9,"male", Arrays.asList("swimming","basketball","baseball","football"));
        };

        System.out.println(supplier.get());

        Supplier<List<Student>> supplierList = () -> StudentDatabase.getAllStudent();

        System.out.println(supplierList.get());

    }
}
