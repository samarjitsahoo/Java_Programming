class Product1
{
    int pro_id;
    String pro_name;
    Product1(int pid,String n)
    {
        pro_id=pid;
        pro_name=n;

    }
    void display()
    {
        System.out.println("product id= "+pro_id+" and product name= "+pro_name);
    }
}
public class Array_of_objects3
{
    public static void main(String[] args) {
        Product1 []obj=new Product1[5];
        obj[0]=new Product1(21,"lexus");
        obj[1]=new Product1(31,"lambo");
        obj[2]=new Product1(41,"jaguar");
        obj[3]=new Product1(51,"Rolls");
        obj[4]=new Product1(61,"Ferrari");
        System.out.println("Product object 1= "); obj[0].display();
        System.out.println("Product object 2= "); obj[1].display();
        System.out.println("Product object 3= "); obj[2].display();
        System.out.println("Product object 4= "); obj[3].display();
        System.out.println("Product object 5= "); obj[4].display();

    }
}
