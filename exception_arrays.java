public class exception_arrays
{
    public static void main(String[] args) {

       int []a={5, 10, 15};
       int b=10;
       try{
       for(int i=0;i<a.length;i++)
       {
           int c=a[i]/(b-a[i]);
           System.out.println("Result= "+c);

       }}
       catch(ArithmeticException e1)
       {
           System.out.println("Divide by zero exception,change the denominator");
       }
       catch(ArrayIndexOutOfBoundsException e2)
       {
           System.out.println("Array index out of bound");
       }
       catch(ArrayStoreException e3)
       {
           System.out.println("Change in Datatype Exception");
       }
       finally
       {
           System.out.println("Exit");
       }


    }
}
