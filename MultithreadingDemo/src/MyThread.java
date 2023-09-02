public class MyThread extends Thread{

    @Override
    public void start() {
        super.start();
        System.out.println("Start method");
    }

    @Override
    public void run() {
        System.out.println("Run method");
    }
}
