package OOPSConcepts.SuperKeyword;

import org.w3c.dom.ls.LSOutput;

public class SuperExample {
    public static void main(String[] args) {


        class Animal {
            String color = "white";


        }

        class home extends Animal {
            String color = "black";


            void sound()

            {
                System.out.println(this.color);//it  calls the current class output
                System.out.println(super.color);//it  calls the super class output

            }
        }
    }
}