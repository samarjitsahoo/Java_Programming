class Car
{
    Car()
    {
        System.out.println("This is a Car");
    }
    void vehicleType()
    {
        System.out.println("This is a sports Car");
    }
}
class Lambo extends Car
{
    Lambo()
    {
        System.out.println("This is Lambo");
    }
    void brandName()
    {
        System.out.println("This brand is Lambo");
    }
    void speed()
    {
        System.out.println("Speed limit is 350km/hr");
    }
}
class Aventador extends Lambo
{
    Aventador()
    {
        System.out.println("This Car is Aventador");
    }
    void speed()
    {
        System.out.println("Max speed is 400km/hr");
    }
}
public class practice_1
{
        public static void main(String args[])
        {
            Aventador a=new Aventador();
            a.vehicleType();
            a.brandName();
            a.speed();
            Lambo l=new Lambo();
            l.speed();
        }
}
