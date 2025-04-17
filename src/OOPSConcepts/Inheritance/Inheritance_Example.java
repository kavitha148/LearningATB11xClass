package OOPSConcepts.Inheritance;

public class Inheritance_Example {
    public static void main(String[] args) {

        Father f = new Father();
        //f is obj  for parent class that can access only father classes variables not son variables/properties
        f.bhk2();
        son s=new son();//s is obj  for sub class that can access only son classes variables not father variables/properties
        s.bhk3();


    }
}

        class Father

        {
            int gold=2;

            void bhk2()
            {
                System.out.println("2 bhk house");
            }
        }

        class son

        {
            void bhk3(){
                System.out.println("3bhk  house");
            }
        }
