package whileloop;

public class Factorial_in_while {
    public static void main(String[] args) {
        //factorial->5!=5*4*3*2*1

        int factorial=1;
        for(int n=5;n>0;n--)
        {
            factorial=n*factorial;
        }
        System.out.println(factorial);
    }
}
