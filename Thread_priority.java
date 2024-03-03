import java.lang.*;
public class Thread_priority extends Thread
{
    public void run()
    {
        System.out.println("Inside run method");

    }
    public static void main(String[]args)
    {
        //creating some threads
        Thread_priority t1=new Thread_priority();
        Thread_priority t2=new Thread_priority();
        Thread_priority t3=new Thread_priority();
        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());
        System.out.println("t3 thread priority: "+t3.getPriority());
        t1.setPriority(2);
        t2.setPriority(5);
        t3.setPriority(8);
        System.out.println("t1 thread priority: "+t1.getPriority());
        System.out.println("t2 thread priority: "+t2.getPriority());
        System.out.println("t3 thread priority: "+t3.getPriority());

        System.out.println("Currently executing thread: "+Thread.currentThread().getName());
        System.out.println("Main thread priority: "+Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("Main Thread Priority: "+Thread.currentThread().getPriority());

    }

}
