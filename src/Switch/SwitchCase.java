package Switch;

import java.util.Scanner;

public class SwitchCase {
//switch cannot return double(no decimal values)

public static void main(String[] args) {
//here integer is a input but if u enter string as a inout then it will throw inputmismatch exception that we need to handle in exception handling
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the day number from 1 to 7");
    int a=sc.nextInt();
    switch (a)
    {
        case 1:
        System.out.println("Monday");
        break;
        case 2:
            System.out.println("tuesday");
            break;
        case 3:
            System.out.println("wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
            case 7:
        System.out.println("Sunday");
        break;
        default:// default statement will print the output if we enter other apart form case statement
            System.out.println("Invalid day number");
break;

    }
}
}
