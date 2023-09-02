package NewSyncronization;

public class Display {


    //1 lakh lines of code lets say
    public void wish(String name)
    {
        synchronized (this)
        {
            for(int i=0;i<=10;i++)
            {
                System.out.print("Good Morning ");
                try {
                    Thread.sleep(2000);
                }catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(name);
            }
        }
    }
}
