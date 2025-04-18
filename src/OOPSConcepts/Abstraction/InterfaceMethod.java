package OOPSConcepts.Abstraction;

public class InterfaceMethod {
}

interface  area
{

    int a=10;// in interface all the variable are final hence we cannot change it
    abstract void method();//interface has only abstract methods


//void display();//complete method is not allowed in interface. if we want to use  then use with static and default keyword after java 8
   default void display()
   {
        System.out.println("thiyakav");
    }

    static  void diaply()
    {
        System.out.println("kavi");
    }



   // area()//interface not allowed to create the constructor
}
