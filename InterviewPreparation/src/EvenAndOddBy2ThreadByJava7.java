public class EvenAndOddBy2ThreadByJava7 implements Runnable{

    static int count =1;
    Object obj;

    public EvenAndOddBy2ThreadByJava7(Object obj) {
        this.obj = obj;
    }

    @Override
    public void run() {

        while(count<=100)
        {
            if(count%2==0 && Thread.currentThread().getName().equals("even"))
            {
               synchronized (obj)
               {
                   System.out.println("Thread Name: "+Thread.currentThread().getName()+", value: "+count);
                    count++;
                   try {
                       obj.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
            }
            if(count % 2 !=0 && Thread.currentThread().getName().equals("odd"))
            {
                synchronized (obj)
                {
                    System.out.println("Thread Name: "+Thread.currentThread().getName()+" value: "+count);
                    count++;
                    obj.notify();
                }
            }
        }

    }

    public static void main(String[] args) {
        Object o = new Object();
        Runnable r1 = new EvenAndOddBy2ThreadByJava7(o);
        Runnable r2 = new EvenAndOddBy2ThreadByJava7(o);
        new Thread(r1, "even").start();
        new Thread(r2,"odd").start();
    }
}
