import java.util.*;

public class Test {

    public static void main(String[] args) {
        // Creating a HashMap of int keys and String values
        HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

        // Adding Key and Value pairs to HashMap
        hashmap.put(22,"A");
        hashmap.put(55,"B");
        hashmap.put(33,"Z");
        hashmap.put(44,"M");
        hashmap.put(99,"I");
        hashmap.put(88,"X");

        System.out.println("Before Sorting:");
        Set<Map.Entry<Integer, String>> entries = hashmap.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while(iterator.hasNext())
        {
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println(next.getKey()+" "+next.getValue());
        }

        System.out.println(sortByvaluea(hashmap));;


    }

    private static HashMap sortByvaluea(HashMap<Integer, String> map) {
        List list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Comparable)((Map.Entry)(o1)).getValue())
                        .compareTo(((Map.Entry)(o2)).getValue());
            }
        });

        HashMap sortedHashMap = new LinkedHashMap();
        for(Iterator it = list.iterator();it.hasNext();)
        {
            Map.Entry entry=(Map.Entry)it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }
}
