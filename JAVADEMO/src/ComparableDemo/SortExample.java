package ComparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Employee> e = new ArrayList<>();
        e.add(new Employee(1, "Yash", "9403"));
        e.add(new Employee(6,"Anita","9850"));
        e.add(new Employee(5,"Sanjay", "9921"));
        System.out.println(e);

        Collections.sort(e);

        //comparable
        System.out.println(e);
    }
}