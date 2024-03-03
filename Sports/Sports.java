package Sports;

interface Sports1 {
    public void run();

}
class Athlete implements Sports1
{
    public void run()
    {
        System.out.println("This is implemented class");
    }
}
class Testing
{
    public static void main(String[] args) {

        Sports.Athlete a=new Sports.Athlete();
        a.run();
        Student.Student1 s = new Student.Student1();
        s.show();



    }
}
