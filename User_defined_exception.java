class MyException extends Exception
{
    MyException(String me)
    {
        super(me);

    }
}

public class User_defined_exception
{
    public static void main(String [] args)
    {
        try{
            throw new MyException("Lamborghini");

        }
        catch(MyException me)
        {
            System.out.println("Balenciaga");
            System.out.println(me.getMessage());

        }

    }
}
