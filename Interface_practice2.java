interface Shape1
{
    float PI=3.141f;
    void volume(int r);

}
class Sphere implements Shape1
{
    public void volume(int r)
    {
        float VS= (float) ((3.0/4.0)*PI*(r*r*r));
        System.out.println("Volume of Sphere= "+VS);

    }
}
class Cone implements Shape1
{
    public void volume(int r)
    {
        float VC= (float) ((1.0/3.0)*PI*(r*r*r));
        System.out.println("Volume of Sphere= "+VC);

    }
}
    public class Interface_practice2

{
    public static void main(String[] args) {
        Sphere S=new Sphere();
        Cone c=new Cone();
        S.volume(10);
        c.volume(5);
    }
}
