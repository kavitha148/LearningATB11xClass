package OOPSConcepts.Abstraction;
/* Interface-> its used to define user defined datatype
--> Interface variables can be inherited to subclasses
--> its used to achieve multiple inheritance in java
--> variabled declared in interface are by default, public, final, stati
--> methods should be in  the inteface  are by public and abstract

--< instead of using class we will use interface
--> its uses the keyword " implements"

--> it can contain
*public fina static variables
*public abstract methids
* public static inner classes
 */

public class InterfaceExample {
    public static void main(String[] args) {

        rectangle r= new rectangle();
        r.getarea(4,5);
        //System.out.println( r.getarea(4,5));
    }
}
//creating interface
interface Polygon
{
    //incomplete method
     void getarea(int length, int breadth);
}

class rectangle implements Polygon{
    @Override
    public void getarea(int length, int breadth)
    {
        int s= length*breadth;
        System.out.println("Area of rectangle is:"+s);

    }
}
