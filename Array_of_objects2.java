class Student {
    public int id;
    public String name;
    Student(int id,String name)
    {
        this.id=id;
        this.name=name;

    }
    public void display()
    {
        System.out.println("Student id= "+id+" and Student name= "+name);
    }
}
public class Array_of_objects2 {
    public static void main(String[] args) {
        Student []arr=new Student[2];
        arr[0]=new Student(21,"Samar");
        arr[1]=new Student(31,"Sagarika");
        arr[0].display();
        arr[1].display();


    }

}
