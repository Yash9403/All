package SyncronizedBlock;

public class Second extends Thread{
    String msg;
    First f;

    public Second(String msg, First f) {
        this.msg = msg;
        this.f = f;
        start();
    }

    @Override
    public void run() {
        synchronized (f)
        {
            f.display(msg);
        }
    }
}
