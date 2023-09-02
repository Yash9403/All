import java.util.HashMap;
import java.util.Map;

public class FindingDuplicateInString {
    public static void main(String[] args) {
        String s = "Yash Yash Patil Nayan Patil";
        String[] s1 = s.split(" ");
        Map<String, Integer> m = new HashMap<String, Integer>();
        for(String ss : s1)
        {
            if(m.containsKey(ss))
            {
                m.put(ss, m.get(ss)+1);
            }
            else{
                m.put(ss, 1);
            }
        }
        System.out.println(m);
    }
}
