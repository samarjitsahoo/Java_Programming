import java.io.*;
class MyException1 extends Exception
{
    public MyException1(String str)
    {
        System.out.println(str);
    }

}
public class Check_negative_Exception
{
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input a number: ");
        try{
            int num=Integer.parseInt(br.readLine());
            if(num<0)
            {
                throw new MyException1("Number is negative");

            }
            else{
                throw new MyException1("Number is positive");

            }
        }
        catch(MyException1 e)
        {
            System.out.println(e);
        }
    }
}
