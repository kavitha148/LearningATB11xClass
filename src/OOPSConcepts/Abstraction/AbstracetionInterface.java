package OOPSConcepts.Abstraction;

public class AbstracetionInterface
{
}
//concrete class means without abstract keyword considered a concrete
class concreteclass implements IncompleteInterface
{

    // ryt click on implements then click  on implements then it will implement the method in class

    @Override
    public void display() {
        System.out.println("this is concrete class which access the interface display method here");

    }
}
interface IncompleteInterface
{
void display();/// this is incomplete method means nothng is there to print inside just mentioning the method name

}
