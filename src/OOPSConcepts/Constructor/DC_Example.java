package OOPSConcepts.Constructor;
//Default cons will give some initialized value for all the variables which we are mentioning
public class DC_Example {
    public static void main(String[] args) {


        Default def = new Default();
        def.name="Maruti";
        System.out.println(def.name);
    }
}
class Default
{
    String name;
    int year;
    String Model;

//Default constructor
    Default()
    {// if we dont define the variable value inside default constructor then it will tae default value of the data type
        //for string-> null as default value
        //int->0 as default value
        name="Innova";
        year=2020;
        Model="xyz";
        System.out.println(name);
    }

}
