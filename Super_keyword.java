class Dp
{
    public void learn()
    {
        System.out.println("Dynamic");
    }
}
class Cp extends Dp
{
    public void learn()
    {
        super.learn();
        System.out.println("Competitive");
    }
}
class Programming extends Cp
{
    public void learn()
    {
        super.learn();
        System.out.println("Programming");

    }
}

public class Super_keyword
{
    public static void main(String args[])
    {
        Programming obj=new Programming();
        obj.learn();

    }
}
