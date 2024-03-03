class Product
{
    int pro_id;
    String pro_name;
    Product(int pid,String n)
    {
        pro_id=pid;
        pro_name=n;

    }
    void display()
    {
        System.out.println("Product id= "+pro_id+" "+"Product name= "+pro_name);
    }

}
public class Array_of_objects
{
    public static void main(String[] args) {
        Product [] obj = new Product[5];
        obj[0]= new Product(21,"Lexus");
        obj[1]= new Product(31,"Mercedus");
        obj[2]= new Product(41,"Bugatti");
        obj[3]= new Product(51,"Lambo");
        obj[4]= new Product(61,"Henessy");
        System.out.println("Product object 1= "); obj[0].display();
        System.out.println("Product object 2= "); obj[1].display();
        System.out.println("Product object 3= "); obj[2].display();
        System.out.println("Product object 4= "); obj[3].display();
        System.out.println("Product object 5= "); obj[4].display();
    }
}
