
@FunctionalInterface
public interface B {

    default void equals(){
        System.out.println("Hello Yash");
    }

    String est();
}
