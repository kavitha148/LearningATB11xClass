package forloop;

public class forloop_IQ {
    public static void main(String[] args) {
        for(int i=0;;i++)//if no condition given then it will print infinite loop
            // possible to declare the i loop without condition
            //but it will run infinite time we have to stop running the program

            /*exit code-0 means successful execution
            exit code 130-> stop by ourself(interrupted)
             */
        {
            System.out.println(i);
        }
    }
}
