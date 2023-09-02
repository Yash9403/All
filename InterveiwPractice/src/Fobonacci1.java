import java.util.Scanner;

public class Fobonacci1 {
    public static void main(String[] args) {
        int num, a=0,b=0,c=1;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        for(int i=0;i<num;i++)
        {
            a=b;
            b=c;
            c = a+b;
            System.out.println(a+" ");
        }
    }
}
