import java.util.HashMap;
import java.util.Map;

public class CalculateNumberofWordsInString {
    public static void main(String[] args) {
        String s = "Yash Patil from Pune Yash";
        String[] s1 = s.split(" ");
        Map<String, Integer> m = new HashMap<>();
        for(int i=0;i<=s1.length-1;i++)
        {
            if(m.containsKey(s1[i]))
            {
                Integer integer = m.get(s1[i]);
                m.put(s1[i],integer+1);
            }
            else{
                m.put(s1[i], 1);
            }
        }
        System.out.println(m);
    }
}
