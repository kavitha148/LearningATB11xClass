package OOPSConcepts.Polymorphism;

public class method_overriding_automation {

    public static void main(String[] args)
    {

        chrome c=new chrome();//created obj for chrome class
        c.openbrowser();
        firefox f=new firefox(); //created obj for firefox class
        f.openbrowser();
        commontoall cs=new commontoall(); //created obj for commontoall class
        cs.openbrowser();

        commontoall d= new chrome();//dynamic dispatch
        d.openbrowser();
    }
}

    class commontoall {
        void openbrowser() {
            System.out.println("opening ie");
        }
    }
        class chrome extends commontoall {

            @Override
            void openbrowser() {
                System.out.println("starting chrome");
            }
        }

        class firefox extends commontoall{
    @Override
            void openbrowser()
    {
        System.out.println("starting firefox");
    }
        }
