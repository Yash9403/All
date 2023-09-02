import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test3 {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);

       System.out.println(swithKeyToValue(2,map1));
    }

    private static Map.Entry<Integer, List<String>> swithKeyToValue(int i,Map<String, Integer> map1) {

        Map.Entry<Integer, List<String>> integerListEntry = map1.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(i-1);
        return integerListEntry;
    }
}
