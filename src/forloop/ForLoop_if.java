package forloop;

public class ForLoop_if {
    public static void main(String[] args) {
        for(int age=0;age<=18;age++)//loop will run 19times with 0 to 18
            if(age<=18)
            {
                System.out.println("you can vote");
            }
        else
            {
                System.out.println("you cannot vote");
            }
    }

}
