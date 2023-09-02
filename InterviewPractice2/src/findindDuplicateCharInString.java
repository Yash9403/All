import java.util.HashMap;
import java.util.Map;

public class findindDuplicateCharInString {
    public static void main(String[] args) {
        String s = "Sakkett Patil";
        String  s1 = s.replaceAll("\\s", "");
        System.out.println(s1);
        Map<Character, Integer> m = new HashMap<>();
        char[] c = s1.toCharArray();
        for(Character cc : c)
        {
            if(m.containsKey(cc))
            {
                m.put(cc, m.get(cc)+1);
            }
            else{
                m.put(cc, 1);
            }
        }
        System.out.println("\n"+m);
    }
}
