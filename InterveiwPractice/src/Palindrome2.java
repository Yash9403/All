import java.util.Scanner;

public class Palindrome2 {
    public static void main(String[] args) {
        String rev = "";
        Scanner sc = new Scanner(System.in);
        String original = sc.nextLine();
        System.out.println("Original String is: "+original);
        for(int i = original.length()-1; i>=0; i--)
        {
            rev = rev + original.charAt(i);
        }

        System.out.println(rev);
    }
}
