
import java.util.Scanner;
class Triangle
{
    int base,height;
    Triangle(int a,int b)
    {
        base=a;height=b;

    }
    float area()
    {
        return(0.5f*base*height);

    }
}
public class Parameterized_Constructor

{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and height: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Triangle t=new Triangle(a,b);
        float d=t.area();
        System.out.println("Area of triangle= "+d);

    }
}
