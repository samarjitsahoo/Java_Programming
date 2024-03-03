class Cost
{
    int cost=100;
    void finding_Cost()
    {
        System.out.println("Cost is= "+cost);
    }
}
class Weight extends Cost
{
    float weight=50f;
    void finding_weight()
    {
        super.finding_Cost();
        System.out.println("Weight is= "+weight);
    }
}
class Volume extends Weight {
    float volume = 35f;

    void finding_Volume()
    {
        super.finding_weight();
        System.out.println("Volume = "+volume);
    }

}
public class Practice4
{
    public static void main(String[] args) {
        Volume v=new Volume();
        v.finding_Volume();
    }
}
