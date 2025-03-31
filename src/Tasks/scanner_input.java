package Tasks;

import java.util.Scanner;

public class scanner_input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age=sc.nextInt();

        System.out.println("Enter name:");
        sc.nextLine();//if you want to use nextline after next command then u need to use onemore nextline before nextline then only it works
        String name=sc.nextLine();

        System.out.println("Enter the salary;");
        double salary =sc.nextDouble();
        System.out.println("Entered information are below:");
        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);
    }
}
