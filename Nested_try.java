import java.util.Scanner;

public class Nested_try
{
    public static void main(String[] args) {
        int [] marks=new int[3];
        marks[0]=7;
        marks[1]=57;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of index: ");
        int index=sc.nextInt();
        try{
            System.out.println("first try block");
            try{
                System.out.println(marks[index]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Index out of bound");
                System.out.println("Exception level 2");
            }

        }
        catch(Exception e)
        {
            System.out.println("Exception level 1");
        }


    }
}
