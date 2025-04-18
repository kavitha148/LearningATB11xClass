package OOPSConcepts.Static;


/*--> Static is a keyword
--> it can be accesed without creatign a obj for the class
--> non access modifier used to indicate a particular methos/variable
--> it refer to the class itself
-->static members are shared among all instances

static can be a
*variable
*method
*block
*class


 */
/* once obj created then first static block will be exected first then class then dc constructor
Static>Class>Default constructot
 */

public class StaticKeyword {
    public static void main(String[] args) {
        Aclass ac=new Aclass();
        Aclass as;//it wont give any nothing will happen as its just a ref and just loaded the class but for who and nt created the obj here

    }
}
class Aclass
{
    {
        System.out.println("this is normal class");
    }
//def constructor
    Aclass()
    {
        System.out.println("DC");
    }

    static
    {
        System.out.println("this is SIB static initialization block");
    }
}
