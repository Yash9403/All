import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        //find the nth highest entry in below given map
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("anil", 1000);
        map1.put("bhavna", 1300);
        map1.put("micael", 1500);
        map1.put("tom", 1600);//output
        map1.put("ankit", 1200);
        map1.put("daniel", 1700);
        map1.put("james", 1400);

        System.out.println(GetNthHighestNumber(2, map1));
    }

    private static Map.Entry<String, Integer> GetNthHighestNumber(int i, Map<String, Integer> map1) {
        return map1.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList()).get(i-1);
    }
}