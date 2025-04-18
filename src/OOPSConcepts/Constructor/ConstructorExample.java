package OOPSConcepts.Constructor;

/*
->cnstructor have the same name as class name
-->it will be called only once at obj creation

--> it willl create automatically but doesnot return anything even void so no need to mention void in methos creation


types:
*default constructor
*parametrized constructor
*copy constructor
 */

public class ConstructorExample {
    public static void main(String[] args) {
        Baby b=new Baby();
        new Baby();//calling defaut constructor 2 times if obj  called 2 times

        Baby b2;//it wont call or print any as bcz its just a ref not the obj created
        //once obj  created for the class, it will print the default constructor(baby()) output automatically

    }
}

class Baby {
    String name;
//it will be called by default
    Baby()
    {
        System.out.println("This is default constructor been called at the time of obj creation for baby class");
    }

    void Cry() {
        System.out.println("baby will cry");

    }

    void sleep() {
        System.out.println("baby wil sleep");
    }
    void eat()

    {
        System.out.println("Baby eats");

    }
}