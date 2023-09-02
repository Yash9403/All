package SynchronizationDemo;

public class MyThread extends Thread{
    String msg;
    Display d;

    public MyThread(String msg, Display d)
    {
        this.msg=msg;
        this.d=d;
    }

    @Override
    public void run() {
        d.wish(msg);
    }
}
