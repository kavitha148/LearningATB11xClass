package OOPSConcepts.Static;

//static block will be called one time per class during entire program execution


public class Static_IIB {

    public static void main(String[] args) {
        //first obj
        tea ref = new tea(10);
        //"Normal variable
        ref.displayvalue(); // this method also prints a value as this method has print function of a


        //second obj
        tea ref1 =new tea(20);
        System.out.println("Normal variable:"+ref1.a);//it also prints a value

        System.out.println("****");

        /* below one nt needed bcz static is not related to obj reference

        System.out.println(ref.b);//this are all static variable hence it wont be changed..common across everywhere
        System.out.println(ref1.b);

        it actually belongs to class
*/
        System.out.println("Static variable prints:"+tea.b  );
    }
}


class tea {
    int a;
    static int b = 15;

    tea(int avalue) {
        this.a = avalue;
    }

    void displayvalue()
    {
        System.out.println(this.a );
    }

}