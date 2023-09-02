import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age < 18)
        {
            throw new TooYoungException("You are too young to get marry");
        } else if (age>60) {
            throw new TooOldException("You are too old for marry");
        }
        System.out.println("Thank you ");
    }
}