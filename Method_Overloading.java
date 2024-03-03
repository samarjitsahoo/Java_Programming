import java.util.Scanner;
class Area1
{
    int area(int l,int b)
    {
        return(l*b);
    }
    float area(float base,float height)
    {
        return(0.5f*base*height);
    }
    int area(int r)
    {
        return(r*r);
    }
}
public class Method_Overloading
{
    public static void main(String args[])
    {
        Area1 a=new Area1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of length and breadth of rectangle: ");
        int l=sc.nextInt();
        int b=sc.nextInt();
        int ar=a.area(l,b);
        System.out.println("Enter values of base and height of triangle: ");
        float base=sc.nextInt();
        float height=sc.nextInt();
        float at=a.area(base,height);
        System.out.println("Enter side of Square: ");
        int r=sc.nextInt();
        int as=a.area(r);
        System.out.println("Area of rectangle: "+ar);
        System.out.println("Area of triangle: "+at);
        System.out.println("Area of square: "+as);

    }
}
