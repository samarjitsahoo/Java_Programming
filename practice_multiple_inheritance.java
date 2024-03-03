class Student1
{
    int rollNumber;
    public void getNumber(int n)
    {
        rollNumber=n;
    }
    public void putNumber()
    {
        System.out.println("Roll number= "+rollNumber);
    }
}
class Test1 extends Student1
{
    float mark1,mark2;
    public void getMarks(float x,float y)
    {
        mark1=x;
        mark2=y;
    }
    public void putMarks()
    {
        System.out.println("Mark1= "+mark1+" Mark2 = "+mark2);
    }
}
interface Sports1
{
    float sportWt=6.0f;
    void putWt();

}
class Result1 extends Test1 implements Sports1
{
    float total;
    public void putWt()
    {
        System.out.println("Sports Wt= "+sportWt);
    }
    void display()
    {
        total=mark1+mark2+sportWt;
        putNumber();
        putMarks();
        putWt();
        System.out.println("Total= "+total);

    }
}
public class practice_multiple_inheritance
{
    public static void main(String []args)
    {
        Result1 res=new Result1();
        res.getNumber(345);
        res.getMarks(33.0f,45.0f);
        res.display();

    }
}
