import java.util.*;
class Sum
{
       static int sum(int x,int y)
       {
           return x+y;
       }
       public static void main(String args[])
       {
           System.out.print("Enter two numbers: ");

           int num1,num2,x;
              Scanner obj=new Scanner (System.in);
              num1=obj.nextInt();
              num2=obj.nextInt();
            x=  sum(num1,num2);
              System.out.println("Sum= "+x);

       }
}