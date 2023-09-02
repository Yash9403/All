import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateHashMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");
        System.out.println(map.size());
        System.out.println("While loop");
        Iterator i = map.entrySet().iterator();
        while(i.hasNext())
        {
         Map.Entry me = (Map.Entry)i.next();
            System.out.println(me.getKey()+" "+me.getValue());
        }

        System.out.println("for loop");
        for(Map.Entry m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
