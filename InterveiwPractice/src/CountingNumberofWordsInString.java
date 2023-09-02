import java.util.HashMap;
import java.util.Map;

public class CountingNumberofWordsInString {
    public static void main(String[] args) {
        String s = "Yash Patil from HSBC As Application Developer from HSBC";
        String[] arr = s.split(" ");
        Map<String, Integer> m = new HashMap<String, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(arr[i]))
            {
                Integer integer = m.get(arr[i]);
                m.put(arr[i], integer+1);
            }
            else{
                m.put(arr[i], 1);
            }
        }
        System.out.println(m);
    }

}
