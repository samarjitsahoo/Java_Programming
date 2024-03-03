class Sample
{
    int a;
    Sample(int x)
    {
        this.a=x;

    }
    void display()
    {
        System.out.println("a= "+a);
    }
}
public class This_Pointer
{
    public static void main(String args[])
    {
        Sample s=new Sample(10);
        s.display();

    }
}
