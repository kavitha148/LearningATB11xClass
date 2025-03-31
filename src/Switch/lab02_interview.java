package Switch;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class lab02_interview {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        //String name=sc.nextLine();
        int number=sc.nextInt();//comma seperated multiple case values allowed for int variable  >jdk 13(above jdk13)
        switch (number)
        {
            case 01,02,03:
                System.out.println("Number available");
                break;
            case 04,05,06:
                System.out.println("Number available in DB");
                break;

            default:
                System.out.println("this number are not available on system");
                break;
        }


    }
}
