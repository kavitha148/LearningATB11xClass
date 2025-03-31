package Switch;

import java.util.Scanner;

public class SwitchcaseWithoutDefault {
    public static void main(String[] args) {
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
    }}
}
//if we enter other number than mentioned in case then it will exit the program if default not mentioned in the program
