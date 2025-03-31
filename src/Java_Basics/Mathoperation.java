package Java_Basics;

public class Mathoperation {

    public static void main(String[] args) {
        int x=10;
        int y=10;
        int z=10;
        int r=-30;
       /* int k=x*x;
        int s=y*y;
        int zc=z*z;*/

        double o=Math.pow(x,2);//gives the power of x(first args)i.e.x2
        double f=Math.pow(y,2);//gives the power of x(first args)i.e.y2
        int l=Math.abs(r);//gives absolute no means if u give -no then it will print +no
        int g=Math.max(4,7);

        System.out.println("Absolute no is:"+l);
        System.out.println("Max no is"+g);
        System.out.println("Maximum no is:"+Math.min(4.7,5.6));//gives the min no which we given
        System.out.println("3 power 4is:"+Math.pow(3,4));//means 3 power4
        System.out.println("square root of"+x+"is:"+Math.sqrt(x));
        System.out.println("square root of "+y+"is:"+Math.sqrt(y));
        //System.out.println("Final ans is"+(Math.cbrt((Math.pow(x,2)+Math.pow(y,2))-Math.abs(z));
    }
}
//pow gives the first args of power which we mentioned ex:2,3 means 2 power3
//sqrt gives square root f the no
//cbrt gives cube root of the no