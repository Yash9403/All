package iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("20");
        list.add("30");
        list.add("40");
        System.out.println(list.size());
        System.out.println("While Loop:");
        Iterator iterator = list.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }

        System.out.println("Advanced For Loop");
        for(Object o : list)
        {
            System.out.println(o);
        }
        System.out.println("for loop");
        for(int i=0;i<=list.size()-1;i++)
        {
            System.out.println(list.get(i));
        }
    }
}
