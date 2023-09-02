import java.util.*;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        List<String> l = Arrays.asList("Yash","Patil","Yash","Neha");
        List<String> collect = l.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);
        Set s = new HashSet<>(l);
        s.stream().forEach(System.out::println);
    }
}
