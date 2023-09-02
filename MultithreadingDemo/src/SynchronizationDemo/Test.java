package SynchronizationDemo;

public class Test {
    public static void main(String[] args) {
        Display d = new Display();
        Display d2 = new Display();
        MyThread m = new MyThread("Yash",d);
        MyThread m2 = new MyThread("Neha", d2);
        m.start();
        m2.start();
    }
}
