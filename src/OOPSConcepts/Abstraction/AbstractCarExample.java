package OOPSConcepts.Abstraction;

public class AbstractCarExample {
    public static void main(String[] args) {

        //only we can create a obj only for child class which extending from parent class where you will add the implementation part
        Maruti m= new Maruti();
        m.driver();

    }
}

//Abstract class
abstract class Engine
{

    //Abstract method
   abstract  void StrtofEngine();
   abstract void stopengine();
}



//concrete class
class Maruti extends Engine
{
//we need to override all the method in child class which defined as abstract in parent class
    @Override
    void StrtofEngine()
    {
        System.out.println("starting the car!");
    }

    @Override
    void stopengine()
    {
        System.out.println("Stopping the car!");

    }
//concrete method
    void driver()
    {
        stopengine();
        StrtofEngine();
    }
}