
public class Static_and_instance_variable{
        int myVariable;
        static int data=60;

    public static void main(String[] args) {
        Static_and_instance_variable obj = new Static_and_instance_variable();
        System.out.println("value of instance variable= "+obj.myVariable);
        System.out.println("value of static variable= "+Static_and_instance_variable.data);

    }
}
