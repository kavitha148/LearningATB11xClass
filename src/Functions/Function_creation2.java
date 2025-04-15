package Functions;
//with args wth return type
public class Function_creation2 {
    public static void main(String[] args) {
        int s = friends(2, 3);
        int k = friends(2, 5);//with same function name we can pass the diff arguments
        System.out.println(s);
        System.out.println(k);
    }

    static int friends(int a, int b) {
        return a + b;
    }
}