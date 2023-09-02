package WithSynchronizedKeyword;

public class Second extends Thread{
    First f;
    String msg;

    public Second(First f, String msg) {
        this.f = f;
        this.msg = msg;
        start();
    }

    @Override
    public void run() {
        f.display(msg);
    }
}
