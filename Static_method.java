class MathOperation
{
    static float mul(float x,float y){
        return x*y;
    }
    static float div(float x,float y)
    {
        return x/y;

    }
}
    public class Static_method
    {
        public static void main(String[] args) {
            float m=MathOperation.mul(10.2f,5.2f);
            float d=MathOperation.div(5.2f,2.2f);
            System.out.println("Product is: "+m);
            System.out.println("After divide: "+d);
        }

}
