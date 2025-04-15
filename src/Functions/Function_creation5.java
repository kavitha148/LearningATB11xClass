package Functions;
//method with return type and with args
public class Function_creation5 {
    public static void main(String[] args) {
        int get=getmessage(4,5);//can pass the input args here
        System.out.println(get);
    }
//Methd or Fucntion creation:
    static int getmessage(int a, int b)//always mention the variable inside the args rather than giving a numbers directly like int 4, int 5
    //static int getmessage(int 4, int 5)-> this is wrong syntax error we hav to give variable name not direct no like 4,5
    {
        return a+b;
        //return 4; this is also a correct but its not meaningful
    }
}
