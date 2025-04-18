package OOPSConcepts.Static;

public class Statickeywordpractiice {
    public static void main(String[] args) {

//Fucntions:
        //Normal function can be called onny thru creating an obj
        //whereas Static function should be called thru class.methodname
        parent par=new parent();
        par.getvalue();//normal func called thru obj par
        parent.getfunction();//static function called


        //Variables calling inside main method:
        //normal variable called thru  obj ref name
        System.out.println(par.a);//here par is a bj so called thru objname.variable name


        //Static variable called thru class

        System.out.println(parent.c);//here parent is a class name so classname.variablename
    }
}
class parent
{
    static
    {
        System.out.println("this is called once once class loaded");
    }
    int a=10;
    static int c=100;
    //not static function
    void getvalue()
    {
        System.out.println("this is nonstatic function");
    }
    static void getfunction()
    {
        System.out.println("this is static function");
    }

    static class child
    {

    }
}

