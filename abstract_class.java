abstract class MyClass
{
    abstract void calculate(int x);
}
class Sub1 extends MyClass
{
    void calculate(int x)
    {
        System.out.println("Square of given no: "+(x*x));
    }
}
class Sub2 extends MyClass
{
    void calculate(int x)
    {
        System.out.println("Square root of given no: "+Math.sqrt(x));
    }
}
class Sub3 extends MyClass
{
    void calculate(int x)
    {
        System.out.println("Cube of given no: "+(x*x*x));
    }
}

public class abstract_class {
    public static void main(String args[])
    {
        Sub1 obj1=new Sub1();
        Sub2 obj2=new Sub2();
        Sub3 obj3=new Sub3();
        obj1.calculate(5);
        obj2.calculate(16);

        obj3.calculate(3);

    }
}
