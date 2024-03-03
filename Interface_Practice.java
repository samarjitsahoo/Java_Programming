class Monkey
{
    void jump()
    {
        System.out.println("Jumping");
    }
    void bite()
    {
        System.out.println("Biting");
    }

}
interface BasicAnimal
{
    void eat();
    void sleep();

}
class Human extends Monkey implements BasicAnimal
{
    void speak()
    {
        System.out.println("Speaking");
    }
    public void eat()
    {
        System.out.println("Eating");
    }
    public void sleep()
    {
        System.out.println("Sleeping");
    }


}



public class Interface_Practice
{
    public static void main(String[]args)
    {
       // Human h=new Human();
       // h.jump();
       // h.bite();
       // h.eat();h.sleep();h.speak();
        Monkey m=new Human();
        m.jump();

    }
}
