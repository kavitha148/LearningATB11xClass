package OOPSConcepts.Static;
//Static block will be executed only once and also it will be executed at first among all classes
public class Staticblock
{
    public static void main(String[] args)
    {

        //eventhough if u create the obj  2 times , static block will be called only once, rest of the class willl execyted 2 times as obj created 2 times

        p ac=new p();//obj created

        p as;//it wont give any nothing will happen as its just a ref and just loaded the class but for who and nt created the obj here

        new p();//objcreated
    }
}
class p
{
    {
        System.out.println("this is normal class");
    }

//SIB-1 time
// IIBor other classes- 2 times based on obj creation

//def constructor
    p()
    {
        System.out.println("DC");
    }

    static
    {
        System.out.println("this is SIB static initialization block");
    }
}
