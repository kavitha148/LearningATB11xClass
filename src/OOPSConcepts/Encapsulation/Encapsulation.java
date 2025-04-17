package OOPSConcepts.Encapsulation;


/*OOPSConcepts.Encapsulation means:

Hiding internal data of a class (using private)

Giving controlled access to that data using getter and setter methods (public)

✅ It's like putting your data in a capsule and only allowing access through safe methods.*/


//here we written why we are using encapsulation example so this is not correct for encapsulation explanation..check encapgood prgrm for correct explanation
public class Encapsulation {
    public static void main(String[] args) {



        loginpage login=new loginpage("kavi","nish");//in this we need to pass the paramter as mentioned in constructor name inside the loginpage class
    String b= login.password;//here accessing another class variables as its mentioned public

        System.out.println(b);
        b= "143";//here we can change the password value(second class value in first class)  as its mentioned as public hence no security
        System.out.println(b );//allowing attribut to modify by another class

}
}

class loginpage
{
    public String username;//instance variables,attributes,datamembers
    public String password;//public allwoed to access by everyone

    //creating parametrized constructor-constructor name should be same as classname

    loginpage(String usr,String pwd)
    {
        this.username=usr;
        this.password=pwd;

    }
}
