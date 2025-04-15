package whileloop;

import java.util.Scanner;

public class Factorial_IQ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number which you want for factorial:");
        int num=sc.nextInt();
        int factorial=1;
        if(num<=0)
        {
            System.out.println(factorial);//1!=1 and 0!=1
        }

        else {
            for(int i=1;i<=num;i++)
            {
                factorial=factorial*i;

            }
            System.out.println("Factorial of"+" "+num+"is"+" "+factorial);
        }

    }
}
