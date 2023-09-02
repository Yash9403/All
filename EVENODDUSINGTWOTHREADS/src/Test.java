public class Test implements Runnable {

    public static int num = 1;
    public static Object object;

    public Test(Object o) {
        this.object = o;
    }

    public static void main(String[] args) {
        Object o = new Object();
        Runnable r1 = new Test(o);
        Runnable r2 = new Test(o);
        new Thread(r1, "even").start();
        new Thread(r2, "odd").start();
    }

    @Override
    public void run() {
        while (num <= 100) {
            if (num % 2 == 0 && Thread.currentThread().getName().equals("even")) {
                synchronized (object) {
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+", value: "+num);
                    num++;
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                    }
                }
            }
            if (num % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
                synchronized (object) {
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+", value: "+num);
                    num++;
                    object.notify();
                }
            }
        }
    }


}