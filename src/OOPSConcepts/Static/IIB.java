package OOPSConcepts.Static;



/*IIB-Instance Initialization Block
I will be executed  when obj is created */


public class IIB {
    public static void main(String[] args) {

//if same obj created 2 times then it will print the output 2 times
        A a= new A();//instance creation
        new A();//-> obj created

       //A a =new A(); or new A()--> both are same in terms od obj creation

    }
}


class A{

    {
        System.out.println("Hi, i am IIB");
    }
    {
        System.out.println("IIB1");
    }

    {
        System.out.println("IIB2");
    }
//Def constructor
    A()
    {
        System.out.println("inside the constructor, it will be called only once");
    }

}