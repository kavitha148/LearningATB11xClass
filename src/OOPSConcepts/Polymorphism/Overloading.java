package OOPSConcepts.Polymorphism;

public class Overloading {

    //in the same class-> same method name but with diff args with diff return type
    //Occurs when multiple methods in the same class have the same name but different parameters.
    //overloading->static->compile time polymorphism
    //same attribute and behavior is different





    public static void main(String[] args)
    {

        kavitha k = new kavitha();
        int s= k.kavi(3,4);//calling same method with 2 args
        //System.out.println(s);
        int l=k.kavi(3,4,5); //calling same method with 3 args
        System.out.println(l);
        double d=k.kavi(2.3,3.4,2.9,4.5);
        System.out.println(d);
    }

}

    class kavitha//class
    {
        int kavi(int a, int b)//method with 2 args and one int return type
        {
            return a + b;//except void need to give this return type for all lik int, string, double,long anything
        }


        int kavi(int a, int b, int c)

        {
            return a + b + c;

        }

        double kavi(double a, double b, double c,double d)

        {

            return a+b+c+d;

        }
    }


