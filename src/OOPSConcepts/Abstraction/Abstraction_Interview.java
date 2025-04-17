package OOPSConcepts.Abstraction;

public class Abstraction_Interview {

    interface T1
    {

    }
    interface t1
    {

    }

    class A1{

    }

    class b1
    {

    }
   // class test extends A1, B1--> not possible

    class test implements T1,t1{

    }

    class A3 extends A1 implements t1,T1{

    }

    //class A6 implements T1 extends b1--> not possible
   //interface extends A1--> not possible bcz it aways implements not extends
    {

    }

}
