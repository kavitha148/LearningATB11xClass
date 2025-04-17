package OOPSConcepts.SuperKeyword;

public class superMethod {



    //parent class
    class A
    {
        void display()
        {
            System.out.println("I love prabu");
        }
    }

    class b extends A   //child class
    {
        void sound()
    {
        System.out.println("sound");
        super.display(); //it calls parent class methos and print i love prabu
    }

    }
}
