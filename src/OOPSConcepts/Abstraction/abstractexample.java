package OOPSConcepts.Abstraction;

/*Abstraction means hiding the implementation details and showing only necessary details to user
java provides two ways to achieve abstraction
1)using abstract class
2)using interface


1)Abstract class:
->abstract use abstract keyword
-> abstract cant be final
-> it can have both abstract methods and concrete methods( without abstract keyword called concrete method or class)
--> abstract class cannot be instantiated
--> abstract class cannot use private, static, final,strictfp,synchrinized,native



-->abstract use extends keyword
--> interface use implements keyword

 */



public class abstractexample {
    public static void main(String[] args) {


//Father f=new Father();--> this is not possible as it doesnt have implementation of abstract method,, incomplet class cannt hv obj
  //  Father F= new son();-> this is possible as its creating a son obj for reference



    son s=new son();//this is possible bcz creating a obj for son class not abstract father class
    s.loan();
    s.loanmethod();

}
}

//Abstract class can hv both abstract method and concrete method
abstract class Father
{

    //abstract method

    abstract void loan();

    //normal method
    void loanmethod()
    {
        System.out.println("giving 20k loan");

    }
}

class son extends Father{


    @Override
    void loan() {
        System.out.println("son has to implement the abstract method which defined in father parent abstract class");
    }
}