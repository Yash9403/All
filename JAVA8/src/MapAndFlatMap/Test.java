package MapAndFlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Employee> emp = Stream.of(
                new Employee("Yash", "9403", Arrays.asList("Yash@gmail.com", "Patil@gmail.com")),
                new Employee("Neha", "9999", Arrays.asList("neha@gmail.com", "patil@gmail.com"))
        ).collect(Collectors.toList());

        List<String> collect = emp.stream().map(Employee::getName).collect(Collectors.toList());
        System.out.println(collect);

        List<String> collect1 = emp.stream().map(Employee::getPhone).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> collect2 = emp.stream().flatMap(e -> e.getEmail().stream()).collect(Collectors.toList());
        System.out.println(collect2);
    }
}
