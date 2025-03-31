package Switch;

import java.util.Scanner;

public class SwitchCaseWithoutBreak {
//switch cannot return double(no decimal values)

public static void main(String[] args) {

    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the day number from 1 to 7");
    int a=sc.nextInt();
    //without break->it wil print all of the print statement
    switch (a)
    {
        case 1:
        System.out.println("Monday");

        case 2:
            System.out.println("tuesday");

        case 3:
            System.out.println("wednesday");

        case 4:
            System.out.println("Thursday");

        case 5:
            System.out.println("Friday");

        case 6:
            System.out.println("Saturday");

            case 7:
        System.out.println("Sunday");

        default:
            System.out.println("Invalid day number");


    }
}
}
