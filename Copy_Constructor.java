import java.util.Scanner;
class Copy
{
    int x,y;
    Copy()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of x and y: ");
        x=sc.nextInt();
        y=sc.nextInt();


    }
    Copy(Copy c1)
    {
        x=c1.x;y=c1.y;

    }
    void display()
    {
        System.out.println("x= "+x);
        System.out.println("y= "+y);

    }
}
public class Copy_Constructor
{
    public static void main(String []args)
    {
        Copy c1=new Copy();
        Copy c2=new Copy(c1);
        c1.display();
        c2.display();
    }
}
