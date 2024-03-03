import java.util.*;
public class rucursion {
    static int sumRec(int n)
    {
        if(n==1){
            return 1;
        }return n+sumRec(n-1);

    }

    public static void main(String args[]){
        int num;
    Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=obj.nextInt();
       int m= sumRec(num);
        System.out.println("Sum= "+m);



}}
