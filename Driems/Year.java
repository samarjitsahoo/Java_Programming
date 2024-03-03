package Driems;

public class Year {
    public void yr()
    {
        System.out.println("second year");
    }
}
class Branch
{
    public void br()
    {
        System.out.println("Branch=cse");
    }
}
class Semester
{
    public void sem()
    {
        System.out.println("fourth sem");
    }
}
class Demo
{
    public static void main(String[] args) {
        Driems.Year y=new Driems.Year();
        Driems.Branch b=new Driems.Branch();
        Driems.Semester s=new Driems.Semester();
        y.yr();
        b.br();
        s.sem();
    }
}
