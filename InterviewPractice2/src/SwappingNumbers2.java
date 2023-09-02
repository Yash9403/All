import java.util.Scanner;

public class SwappingNumbers2 {
    public static void main(String[] args) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x and y: ");
        x = sc.nextInt();
        y = sc.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("x: "+x+" y: "+y);
    }
}
