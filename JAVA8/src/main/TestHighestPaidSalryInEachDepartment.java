package main;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestHighestPaidSalryInEachDepartment {

    public static void main(String[] args) {
        List<Employee> e = Stream.of(
                new Employee(1, "Yash", "IT", 2000000),
                new Employee(2, "Neha", "comp", 1000000),
                new Employee(3, "Shruti", "comp", 1500000),
                new Employee(4, "Darshan", "mech", 5000000)
        ).collect(Collectors.toList());

        Comparator<Employee> comparing = Comparator.comparing(Employee::getSalary);

        Map<String, Optional<Employee>> collect = e.stream()
                .collect(Collectors.groupingBy(Employee::getDep,
                        Collectors.reducing(BinaryOperator.maxBy(comparing))));


        System.out.println(collect);
    }
}
