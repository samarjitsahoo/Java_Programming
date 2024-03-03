import java.util.Scanner;
class Trying
{
    int x,y,z;
    void entry()
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter values of x and y: ");
    x=sc.nextInt();
    y=sc.nextInt();}
    void checking(){
    try
    {
        z=x/y;
        System.out.println("Result= "+z);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Divide by zero Exception, Change value of denominator");
    }
    finally
    {
        System.out.println("Exit");
    }
}}
public class exception_using_class_object
{ public static void main(String[] args) {
    Trying t=new Trying();
    t.entry();
    t.checking();



}
}
