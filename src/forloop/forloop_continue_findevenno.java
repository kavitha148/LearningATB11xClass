package forloop;

public class forloop_continue_findevenno {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++)
        {
            if(i%2==0)
            {
                System.out.println("Even no->"+i);
                continue;//after printing even no then loop will continue.. if its not even no then it will come out of the loop and print outside as a odd no
            }
            System.out.println("odd no is->"+i);
        }
    }
}
