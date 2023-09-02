package main;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacterUsingJava8 {

    public static void main(String[] args) {
        String s = "Basanta";
        Map<String, Long> collect = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

                System.out.println(collect);
    }
}
