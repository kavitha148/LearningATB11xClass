package Switch;

import java.util.Scanner;

public class Realtime_Switch_Automation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the browser:");
        String browser=sc.nextLine();
        switch (browser)
        {
            case "chrome":
                System.out.println("Chrome browser");
                System.out.println("Start the test");
                break;
            case "firefox":
                System.out.println("Starting firefox");
                break;
            case "Edge":
                System.out.println("Starting edge browser");
            break;
            default:
                System.out.println("does not support for selenium");
                break;
        }//opera will not support for selenium testing


    }

}
