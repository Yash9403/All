package SynchronizationDemo;

public class Display {
    public synchronized static void wish(String name)
    {
        for(int i=0; i<10;i++)
        {
            System.out.print("Good Morning : ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){e.printStackTrace();}
            System.out.println(name);
        }
    }
}
