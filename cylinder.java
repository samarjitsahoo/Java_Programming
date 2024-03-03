class Cylinder
{
    private int radius;
    private int height;
    public int getRadius()
    {
       return radius;
    }
    public void setRadius(int radius)
    {
        this.radius=radius;
    }
    public int getHeight()
    {
        return height;
    }
    public void setHeight(int height)
    {
        this.height=height;
    }


public static void main(String args[])
{
    Cylinder myCylinder=new Cylinder();
    myCylinder.setHeight(12);
    int h=myCylinder.getHeight();
    System.out.println(h);

}}
