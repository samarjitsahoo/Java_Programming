import java.util.Scanner;
class Rectangle2
{
    int length,width;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width: ");
        length=sc.nextInt();
        width=sc.nextInt();

    }
    int area()
    {
        int a = length*width;
        return (a);

    }
}

public class Class_and_Object
{
    public static void main(String []args)
    {
        Rectangle2 r=new Rectangle2();
        r.input();
        int area=r.area();
        System.out.println("Area of rectangle= "+area);

    }
}
