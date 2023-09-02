import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        Map<String,Integer> map =new HashMap<>();
        map.put("anil", 1000);
        map.put("ankit", 1200);
        map.put("bhavna", 1200);
        map.put("james", 1200);
        map.put("micael", 1000);
        map.put("tom", 1300);
        map.put("daniel", 1300);
        System.out.println(map);
        System.out.println(getNthHighestSalary(map, 2));
    }

    private static Map.Entry<Integer, List<String>> getNthHighestSalary(Map<String, Integer> map, int i) {
        Map.Entry<Integer, List<String>> integerListEntry = map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(i - 1);
        return integerListEntry;
    }
}
