class Animal1
{
    void eating()
    {
        System.out.println("eating");
    }
}
class Dog1 extends Animal1
{
    void bark()
    {
        System.out.println("barking");
    }
}
class Cat1 extends Animal1
{
    void meow()
    {
        System.out.println("meowing");

    }
}
public class Practice3
{
    public static void main(String args[])
    {
        Cat1 c=new Cat1();
        c.eating();
        c.meow();
        Dog1 d=new Dog1();
        d.eating();
        d.bark();


    }
}
