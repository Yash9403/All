import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("anil", 1000);
        map2.put("ankit", 1200);
        map2.put("bhavna", 1200);
        map2.put("james", 1200);
        map2.put("micael", 1000);
        map2.put("tom", 1300);
        map2.put("daniel", 1300);

        System.out.println(getNthHighestSalary(2, map2));
    }

    private static Map.Entry<Integer, List<String>> getNthHighestSalary(int i, Map<String, Integer> map2) {
        Map.Entry<Integer, List<String>> collect = map2.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(i-1);

        return collect;
    }
}
