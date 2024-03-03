import java.util.*;
public class pattern2
{
    static void pattern(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        pattern(num);
    }
}
