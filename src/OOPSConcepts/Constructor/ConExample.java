package OOPSConcepts.Constructor;

//Default constructor example

public class ConExample {
    public static void main(String[] args) {
        webautomation we=new webautomation();

    }
}

class webautomation
{

    //Default constructor
    webautomation()
    {

        System.out.println("before we start something if we need something thn we can mention here");
        System.out.println("start the project");
        System.out.println("Read the data!");
        System.out.println("Default constructor will be created by default in Java even if we dont created by us!Its enough if we created the obj for class as its name as same as class name");
    }
}