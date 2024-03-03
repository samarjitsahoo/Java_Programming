interface SampleInterface  //Interface 1
{
    void meth1();
    void meth2();
}
interface ChildSampleInterface extends SampleInterface  //Interface 2
{
    void meth3();
    void meth4();
}
class MySampleClass implements ChildSampleInterface  //Class 1
{
   public void meth1()
    {
        System.out.println("Method 1");
    }
    public void meth2()
    {
        System.out.println("Method 2");
    }
    public void meth3()
    {
        System.out.println("Method 3");
    }
    public void meth4()
    {
        System.out.println("Method 4");
    }
}
public class inheritance_in_interface  //Main Class
{
    public static void main(String []args)
    {
        MySampleClass obj=new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
