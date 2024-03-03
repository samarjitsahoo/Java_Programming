package Samar;
class C1
{
    public int x=5;
    protected int y=6;
    int z=7;
    private int a=8;
    public void meth1()
    {
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
public class package_1 {
    public static void main(String[] args) {
        C1 c=new C1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        //System.out.println(c.a);

    }

}
