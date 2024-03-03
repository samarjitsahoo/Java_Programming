abstract class Pen
{
    abstract void parker();
    abstract void write();
    abstract void refill();
}
abstract class FountainPen extends Pen
{
    abstract void parker();
    void write()
    {
        System.out.println("Writing");
    }
    void refill()
    {
        System.out.println("Refilling");
    }
    void changeNib()
    {
        System.out.println("Changing the nib");
    }


}
class Parker1 extends FountainPen
{
    void parker()
    {
        System.out.println("This is parker pen");
    }
}
public class Abstract_class_practice
{
    public static void main(String[]args)
    {
        Parker1 p=new Parker1();
        p.parker();
        p.write();
        p.changeNib();
        p.refill();

    }
}
