package forloop;

import java.util.Scanner;

public class forloop_odd_evenno {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter any no between 1 to 50");
//        int num = sc.nextInt();


        //printing even number from 1 to 50
        for (int i = 1; i <= 50; i++) {
            if (i%2 == 0)
                System.out.println("Even->:"+i);



        }
    }
}