import java.util.*;

public class mul {
    static void multiplication(int n)
    {
        for(int i=1;i<=10;i++)
        {
            System.out.printf("%d X %d = %d",n,i,n*i);
            System.out.println();

        }
    }

    public static void main(String args[])
    {
        int num;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=obj.nextInt();
        multiplication(num);
    }
}
