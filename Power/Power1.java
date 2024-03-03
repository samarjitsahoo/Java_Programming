package Power;

import java.util.Scanner;

public class Power1
{
    int base,exponent;
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and exponent: ");
        base = sc.nextInt();
        exponent = sc.nextInt();
    }
    void calculate()
    {
        System.out.println("power= "+Math.pow(base,exponent));

    }
}
class Calculator
{
    public static void main(String[] args) {
        Power.Power1 p=new Power.Power1();
        p.input();
        p.calculate();

    }
}
