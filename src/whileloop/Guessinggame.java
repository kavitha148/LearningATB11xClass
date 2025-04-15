package whileloop;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {
    public static void main(String[] args) {
        Random a = new Random();//random is a class where it will run and provide random number for each run based on limit which we give
        int numberguess = a.nextInt(100) + 1;//here limit is 10 if you want to include 10 also the need to add +1
       // System.out.println(numberguess);

        Scanner sc = new Scanner(System.in);
        System.out.println("guess the number between 1 to 100 and enter here:");

        //while loop using
        int attempt = 0;
        while (true) {
            int usernum = sc.nextInt();
            attempt++;

            if (usernum < numberguess) {
                System.out.println("its too low, try again!");

            }
            else if (usernum > numberguess) {
                System.out.println("too high, try again!");

            } else {
                System.out.println("Perfect! you won!You guessed it in"+attempt+"attempts");
                break;

            }
        }
    }
}