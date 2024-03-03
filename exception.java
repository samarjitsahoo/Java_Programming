import java.util.Scanner;

public class exception {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values of x and y: ");
        x=sc.nextInt();
        y=sc.nextInt();
        try
        {
            z=x/y;
            System.out.println("Result= "+z);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero Exception, Change value of denominator");
        }
        finally
        {
            System.out.println("Exit");
        }

    }
}
