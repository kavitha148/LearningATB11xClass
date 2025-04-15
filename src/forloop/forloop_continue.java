package forloop;

public class forloop_continue {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            //loop executes 20times form 0 to 19
            if (i == 5) {
                continue;//it will skip the below code and move to top
                //also it will skip when i reaches 5 once it became true

            }
            System.out.println(i);
        }
    }
}
//this program will print from 0 to 19 but will skip the line no 5