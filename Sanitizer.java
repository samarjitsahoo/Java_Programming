class Thread4 extends Thread
{
    public void run()
    {
        System.out.println("Hello");
    }
}
class Thread5 extends Thread
{
    public void run()
    {
        System.out.println("Wear Mask");
    }
}
class Thread6 extends Thread
{
    public void run()
    {
        System.out.println("Use Sanitizer");
    }
}

public class Sanitizer
{
    public static void main(String[] args) {
        Thread4 th4=new Thread4();
        Thread5 th5=new Thread5();
        Thread6 th6=new Thread6();
        th4.setPriority(Thread.MIN_PRIORITY);
        th5.setPriority(2);
        th6.setPriority(Thread.MAX_PRIORITY);
        th4.start();
        th5.start();
        th6.start();


    }
}
