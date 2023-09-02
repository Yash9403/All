package RunnableDemo;

public class A implements Runnable{
    @Override
    public void run() {
        for (int i=0; i<=100; i++)
        {
            System.out.println("A");
            try{
                Thread.sleep(200);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
