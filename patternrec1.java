import java.util.*;
public class patternrec1
{
    static void pattern1_rec(int n)
    {
        if(n>0)
        {
            pattern1_rec(n-1);
            for(int i=0;i<n;i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number: ");
        Scanner obj=new Scanner(System.in);
        num=obj.nextInt();
        pattern1_rec(num);

    }
}
