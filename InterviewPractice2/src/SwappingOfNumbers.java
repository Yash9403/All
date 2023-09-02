import java.util.Scanner;

public class SwappingOfNumbers {
    public static void main(String[] args) {
        int x, y, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers: ");
        x = sc.nextInt();
        y = sc.nextInt();

        temp = x;
        x = y;
        y = temp;
        System.out.println("x : "+x+" y: "+y);
    }
}
