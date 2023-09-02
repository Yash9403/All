import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface A {

    public String doPayment(String amount, String password);

    static void printAmount(String amount)
    {
        System.out.println("Hello Yash");
    }

    default double getSratchCard()
    {
        return new Random().nextDouble();
    }

    static String datePattern(String pattern)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date());
    }
}
