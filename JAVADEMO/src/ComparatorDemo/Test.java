package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Employee> e = new ArrayList<>();
        e.add(new Employee(10,"Yash","8767"));
        e.add(new Employee(9,"Anita","9850"));
        e.add(new Employee(6,"Neha","1234"));
        System.out.println(e);
        Collections.sort(e,new IdComparator());
        System.out.println(e);

        List<Employee> ee = new ArrayList<>(e);
        Collections.sort(ee,new NameComparator());
        System.out.println(ee);
    }
}
