package OptionalClassDemo;

import java.util.Optional;

public class Test {

    public static Optional<String> method()
    {
        String s = "Patil";
        Optional ss = Optional.ofNullable(s);
        return ss;
    }

    public static void main(String[] args) {
        String s = null;
        Optional<String> n = Optional.ofNullable(s);
        System.out.println(n.isPresent());
        System.out.println(n.orElse("Not Present"));

        Optional<String> method = method();
        String s1 = method.get();
        System.out.println(s1);
    }
}
