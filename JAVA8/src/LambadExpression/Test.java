package LambadExpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 4, 6, 8, 9, 1, 2, 10);

       list.stream().filter((i) -> (i > 4)).sorted().forEach(Test::printElement);

    }

    public static void printElement(int i)
    {
        System.out.println(i);
    }
}
