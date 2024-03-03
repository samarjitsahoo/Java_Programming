import java.util.Scanner;
public class SIP
{
    float P,n,i;
    void input() {
        Scanner money=new Scanner(System.in);
        System.out.println("Enter the amount you want to invest at regular intervals per month: ");
        P = money.nextFloat();
        System.out.println("Enter the number of payments you have made as per year: ");
        n = money.nextFloat();
        System.out.println("Enter the periodic rate of interest per year: ");
        i = money.nextFloat();
    }
    double calculating_SIP()
    {
        float fi=i/12/100;
        return (P*(((Math.pow(1+fi,n*12))-1)/fi)*(1+fi));
    }}
class MoneyAddiction
{
    public static void main(String[] args)
    {
        SIP transaction=new SIP();
        transaction.input();
        double M=transaction.calculating_SIP();
        System.out.println("Future Amount= "+M);
    }}
