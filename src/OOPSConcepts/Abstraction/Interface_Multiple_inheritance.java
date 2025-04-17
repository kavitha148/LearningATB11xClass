package OOPSConcepts.Abstraction;

public class Interface_Multiple_inheritance {
    public static void main(String[] args) {
        child c= new child();
        c.money();
    }
}
class child implements mother,father
{

    @Override
    public void money() {
        System.out.println("money given");
    }
}

interface mother
{
    void money();
}

interface father
{
    void money();
}