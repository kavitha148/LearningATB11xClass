package OOPSConcepts.Abstraction;

/* In interface-> we need to create the method using interface keyword without implementation
-> then we need to create one child class-> in child class, we need to implement all the methods which described in the interface

 */

public class Interfaceexampletwo {
    public static void main(String[] args) {
        InnovaCar cs= new InnovaCar();
        cs.driveman();

    }
}


//multiple inheritance used here as it implements 2 interface to one child class
class InnovaCar implements engine,brakes
{

    void driveman()
    {

        applybreak();
        startEngine();
        stopEngine();
    }

    @Override
    public void applybreak() {
        System.out.println("Apply break");

    }

    @Override
    public void startEngine() {
        System.out.println("start engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine");
    }
}


interface brakes
{
void applybreak();

}

interface engine
{
void startEngine();
void stopEngine();
default void test()
{
    System.out.println("testing");
}
}
