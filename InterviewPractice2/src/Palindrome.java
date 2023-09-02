import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String reverse = "";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = s.length()-1;i>=0;i--)
        {
            reverse = reverse + s.charAt(i);
        }
        System.out.println(reverse);
        if(s.equals(reverse))
        {
            System.out.println("String is Palindome");
        }
        else{
            System.out.println("String is not Palindrome");
        }
    }
}
