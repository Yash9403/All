import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeMap<String, String> treemap = new TreeMap<String, String>();
        // Add Key-Value pairs to TreeMap
        treemap.put("Key1", "Pear");
        treemap.put("Key2", "Apple");
        treemap.put("Key3", "Orange");
        treemap.put("Key4", "Papaya");
        treemap.put("Key5", "Banana");

        Set entries = treemap.entrySet();
        Iterator iterator = entries.iterator();
        while(iterator.hasNext())
        {
            Map.Entry key = (Map.Entry)iterator.next();
            System.out.println(key.getKey()+" "+key.getValue());
        }

    }
}
