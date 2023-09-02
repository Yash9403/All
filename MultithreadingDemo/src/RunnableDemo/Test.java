package RunnableDemo;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        Thread t = new Thread(a);
        t.start();
        for(int i=0;i<10;i++)
        {
            System.out.println("Main__Method");
            Thread.sleep(200);
        }
        t.join(200);
        for(int i=0;i<10;i++)
        {
            System.out.println("Main---method");
        }

    }
}
