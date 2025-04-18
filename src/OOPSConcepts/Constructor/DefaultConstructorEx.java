package OOPSConcepts.Constructor;

public class DefaultConstructorEx {
    public static void main(String[] args) {

//default constructor value will be same for all types of obj

        //first obj
        car2 ka=new car2();
        System.out.println(ka.year);
        String s=  ka.Carname;
        System.out.println(s);
        System.out.println("------------------");

//second obj

        car2 ka1= new car2();
        //ka1.Carname="tesla"; //--> we can change the  datatype value
        System.out.println(ka1.Carname);
        System.out.println(ka.year);


    }
}
class  car2
{
      //Data attributes
    int year;
    String Carname;

    //Default constructor
    car2()
    {
         year=1999;
        Carname="Suzuki";

    }

}