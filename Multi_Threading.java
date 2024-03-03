import java.lang.*;

class MultiThreadingDemo extends Thread{
    public void run()
    {
        try{
            System.out.println ("Thread "+Thread.currentThread().getId()+" is running");

        }
        catch(Exception e)
        {
            System.out.println("exception caught");

        }
    }
}


public class Multi_Threading
{
    public static void main(String[]args)
    {
        int n=8;
        for(int i=0;i<n;i++)
        {
            MultiThreadingDemo obj=new MultiThreadingDemo();
            obj.start();
        }
    }
}
