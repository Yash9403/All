package DuplicatesInString;

public class Test {
    public static void main(String[] args) {
        String s = "Sakkett";
        int count=0;
        char[] aa = s.toCharArray();
        for(int i=0; i<=s.length()-1;i++)
        {
            for(int j=i+1; j<=s.length()-1;j++)
            {
                if(aa[i]==aa[j])
                {
                    System.out.println(aa[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
