import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void removeduplicates(int n, char[] str)
    {
        Set<Character> s = new LinkedHashSet<>(n-1);
        for (char x : str)
        {
            s.add(x);
        }
        for(char x : s)
        {
            System.out.print(x);
        }
    }

    public static void main(String[] args) {

        System.out.println("Hello world!");
        char arr[] = "geeksforgeeks".toCharArray();
        int n = arr.length;
        removeduplicates(n,arr);
    }
}