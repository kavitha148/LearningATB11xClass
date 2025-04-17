package OOPSConcepts.Abstraction;


public class Interfacewithtwoclass {
    public static void main(String[] args) {

        rectangle r= new rectangle();
        r.getarea(4,5);
        //System.out.println( r.getarea(4,5));
        square sq=new square();
        sq.getarea(3,7);
    }
}
//creating interface
interface Polygona
{
    //incomplete method
     void getarea(int length, int breadth);
}

class square implements Polygona{


    @Override
    public void getarea(int length, int breadth) {
        System.out.println("Area of rectabgle in square method is:" +3.14*length*breadth);
    }
}


class rectangleq implements Polygona{
    @Override
    public void getarea(int length, int breadth)
    {
        int s= length*breadth;
        System.out.println("Area of rectangle is:"+s);

    }
}
