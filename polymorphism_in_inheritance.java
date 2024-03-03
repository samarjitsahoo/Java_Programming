interface MyCamera  //Interface 1
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record4kVideo()
    {
        greet();
        System.out.println("Recording in 4k...");
    }
}
interface MyWifi  //Interface 2
{
    String [] getNetworks();
    void connectToNetworks(String network);
}
class MyCellPhone  //Class 1
{
    void callNumber(int phoneNumber)
    {
        System.out.println("Calling "+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class MySmartPhone extends MyCellPhone implements MyWifi,MyCamera
{
    public void takeSnap()
    {
        System.out.println("Taking Snap...");
    }
    public void recordVideo()
    {
        System.out.println("Recording Video...");
    }
    public String [] getNetworks()
    {
        System.out.println("Getting List Of Networks...");
        String [] networkList={"Samar","Harry","Coding"};
        return networkList;
    }
    public void connectToNetworks(String networks)
    {
        System.out.println("Connecting to "+ networks);
    }
}
public class polymorphism_in_inheritance
{
    public static void main(String args[])
    {
        MyCellPhone cam=new MySmartPhone();
        cam.callNumber(637090933);




    }
}
