package Functions;

import java.util.Scanner;

public class Add_sub_mul_div_in_function {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int a=0;
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        }
        else
        {
            System.out.println("Enter the integer number only");
            System.exit(0);
        }

        System.out.println("Enter the second number ");
        int b=0;
        if (sc.hasNextInt())
        {
            b = sc.nextInt();
        } else
        {
            System.out.println("Enter the int only, ");
            System.exit(0);
            sc.close();
        }

        //calling a function

        int addition = add(a, b);
        int subtraction = sub(a, b);
        int mul = multiply(a, b);
        int division = div(a, b);
        int modul = modulo(a, b);

//display results
        System.out.println("Addition:"+addition);
        System.out.println("subtraction:"+subtraction);
        System.out.println("mul:"+mul);
        System.out.println("division:"+division);
        System.out.println("modul:"+modul);
    }
//defining a function
    static int add(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }
    static int multiply(int a, int b)
    {
        if(a==0&b==0)
        {
            System.out.println("enter other number except 0");
        }
        return a*b;
    }
    static int div(int a, int b)
    {
        if(a==0&b==0)
    {
        System.out.println("enter the no except 0");
    }
        return a/b;
    }
    static int modulo(int a, int b)
    {
        return a%b;
    }
}
