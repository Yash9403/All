import java.util.Arrays;
import java.util.HashMap;

public class FinalCountWords {
    public static void main(String[] args) {
        String str = "This this is is done by Saket Saket";
        String[] split = str.split(" ");

        HashMap<String, Integer> h = new HashMap<>();
        for(int i=0;i<split.length;i++)
        {
            if(h.containsKey(split[i])){
                Integer integer = h.get(split[i]);
                h.put(split[i], integer+1);
            }
            else{
                h.put(split[i],1);
            }
        }
        System.out.println(h);
    }
}
