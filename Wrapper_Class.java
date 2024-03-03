import java.io.*;
public class Wrapper_Class
{
    public static void main(String[]args)
    {

        byte a=1;                               //byte datatype
        Byte byteobj=new Byte(a);               //wrapping around byte object
        int b=10;
        Integer intobj=new Integer(b);          //wrapping around integer object
        float c=18.6f;
        Float floatobj=new Float(c);            //wrapping around float object
        double d=250.5;
        Double doubleobj=new Double(d);         //wrapping around double object
        char e='a';
        Character charobj=new Character(e);     //wrapping around character object
        System.out.println("Values of Wrapper Objects(printing as object)");
        System.out.println("Byte object byteobj: "+byteobj);
        System.out.println("Integer object intobj: "+intobj);
        System.out.println("Float object floatobj: "+floatobj);
        System.out.println("Double object doubleobj: "+doubleobj);
        System.out.println("Character object charobj: "+charobj);

        //unwrapping objects to primitive datatype

        byte bv=byteobj;
        int iv=intobj;
        float fv=floatobj;
        double dv=doubleobj;
        char cv=charobj;
        System.out.println("Unwrapping values (printing as datatype)");
        System.out.println("byte value,bv= "+bv);
        System.out.println("integre value,iv= "+iv);
        System.out.println("float value, fv= "+fv);
        System.out.println("double value, dv= "+dv);
        System.out.println("character value, cv= "+cv);


    }

}
