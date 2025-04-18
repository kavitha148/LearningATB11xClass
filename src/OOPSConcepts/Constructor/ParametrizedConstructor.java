package OOPSConcepts.Constructor;

class ParametrizedConstructor
{
    public static void main(String[] args) {


        carDrive cd=new carDrive();//DC obj creation
        System.out.println( cd.name);
        System.out.println("***********");


        //param const obj creation
        //first obj
        carDrive cds = new carDrive(1999,"Nano");
        String f=cds.name;
        System.out.println(f);

        System.out.println("***********");

        //second obj
        carDrive cd1 = new carDrive(2025,"Audi");
        System.out.println(cd1.name);

    }
    }


    class carDrive{
      //Data attributes
    int year;
    String name;

    //Default constructor
    carDrive()
    {
         year=1999;
        name="scorpio";

    }

//param constr
carDrive(int year, String name)
    {

//this is a ref keyword that refers the current obj//-> access instance variables
        this.year=year;// this will refer to the latest obj creation reference
        this.name=name;

    }
}