class A1 extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            if(i==1)
            {
                Thread.yield();
            }
            System.out.println("Thread A1= "+i);
        }
        System.out.println("Exit from A1");
    }
}
class B1 extends Thread
{
    public void run()
    {
        for(int j=1;j<5;j++)
        {
            System.out.println("Thread B1= "+j);
            if(j==3) {
                try{
                sleep(1000);}
                catch(InterruptedException e)
                {
                    System.out.println(e);
                }
            }

        }
        System.out.println("Exit from B1");
    }
}
class C1 extends Thread
{
    public void run()
    {
        for(int k=1;k<5;k++)
        {
            System.out.println("Thread C1= "+k);
            if(k==1)
                try{
                    sleep(1000);

                }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }

        }
        System.out.println("Exit from C1");
    }

}
public class Thread_Practice
{
    public static void main(String [] args)
    {
        A1 threadA1 = new A1();
        B1 threadB1 = new B1();
        C1 threadC1 = new C1();
        System.out.println("Start thread A1");
        threadA1.start();
        System.out.println("Start thread B1");
        threadB1.start();
        System.out.println("Start thread C1");
        threadC1.start();
        threadB1.interrupt();


    }
}
