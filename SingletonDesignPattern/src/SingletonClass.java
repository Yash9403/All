public class SingletonClass {
    public static void main(String[] args) {
        Test t1 = Test.createInstance();
        Test t2 = Test.createInstance();
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());

    }
}
