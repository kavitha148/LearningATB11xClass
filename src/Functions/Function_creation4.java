package Functions;
//method with string return type but no args
public class Function_creation4 {


    public static void main(String[] args)
    {

        String s=get();//if we need to call the func inside main method then always assign the method into some var
        System.out.println(s);//if u put print statement then it will print the return value
    }

    //Method Creation:
    static String get()
    {

        return "kavi";
    }
}
