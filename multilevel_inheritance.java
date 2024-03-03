class Shape  //Class 1
{
    public void display()
    {
        System.out.println("Inside Display");
    }
}
class Rectangle1 extends Shape  //Class 2
{
    public void area()
    {
        System.out.println("Inside Area");
    }
}
class Cube extends Rectangle1  //Class 3
{
    public void volume()
    {
        System.out.println("Inside Voulme");
    }
}
public class multilevel_inheritance //Main Class
{
    public static void main(String[]args)
    {
        Cube c=new Cube();
        c.display();
        c.area();
        c.volume();

    }
}
