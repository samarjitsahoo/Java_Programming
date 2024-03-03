interface Father
{
    float ht=6.2f;
    void height();
}
interface Mother
{
    float ht=5.5f;
    void height();

}

public class multiple_interface implements Father,Mother
{
    public void height()
    {
        float ht=(Father.ht+Mother.ht)/2;
        System.out.println("Height of child: "+ht);

    }
    public static void main(String args[])
    {
        multiple_interface ob=new multiple_interface();
        ob.height();
    }
}
