import java.util.TreeSet;

public class Test {
    public static void main(String[] args)
    {
        TreeSet t = new TreeSet(new MyComparator());
        t.add("Raja");
        t.add("Shobharani");
        t.add("Rajakumari");
        t.add("GangaBhavani");
        t.add("Ramallama");
        System.out.println(t);


        System.out.println("Hello world!");
    }
}