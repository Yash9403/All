public class ReverseString {
    public static void main(String[] args) {
        String str = "Yash Patil";
        char[] s = str.toCharArray();
        for(int i=s.length-1; i>=0;i--)
        {
            System.out.print(s[i]);
        }
    }
}
