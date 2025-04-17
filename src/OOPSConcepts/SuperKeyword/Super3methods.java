package OOPSConcepts.SuperKeyword;

//in super keyword-> only  child classes can access the parent class variable and methods

public class Super3methods {
}
class A
{
    void set()
    {
        System.out.println("get it");
    }
}

class B extends A
{
    void set()
    {
        System.out.println("set it");
        this.set();//it calls the B method itself
        super.set();//it calls the A methos as its a parent class of B//here ouput is get it
    }
}
class C extends  B
{
    String name;
    void set()
    {
        System.out.println("few things too prepare");
        super.set();//it calls the B methos (parent class of c)-> here output is set it
    }


}

/*also when child is creating a constructor  then parent constructor wil be created automaticaly

example:   dog()-> constructor
super()=> complier will  creat this automatically then it will create the parent class constructor automatically from which extends
 */
