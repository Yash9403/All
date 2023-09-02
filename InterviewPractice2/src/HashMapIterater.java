import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterater {
    public static void main(String[] args) {
        HashMap<Integer, String> map= new HashMap<>();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");
        System.out.println(map.size());
        System.out.println("While Loop:");

        Iterator itr = map.entrySet().iterator();
        while(itr.hasNext())
        {
             Map.Entry me = (Map.Entry)itr.next();
        }
    }
}
