package OOPSConcepts.Static;

public class StaticMethodex {
}

class nish
{

    int x;
    static int y=90;


    void display()
    {
        System.out.println("this is normal function");
        System.out.println(y);//here we can call static variable inside the nonstatic function
    }

    static void display2()
    {
        //System.out.println(x);//but we cant call normal variable inside the static function
    }
}
