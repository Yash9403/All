public class Test {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        MyThread m = new MyThread();
        m.start();
        m.start();
        System.out.println("Main method");
    }
}