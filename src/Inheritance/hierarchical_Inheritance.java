package Inheritance;

public class hierarchical_Inheritance {

    //Multiple derived classes inherit  from  single base class

    //example:Father-home(obj)-> all sons  and father are using their home// multiple children accessing fatehr accessories(base class)
    public void main(String[] args) {

        Father m = new menaka();//creating obj for menaka class
        m.home();//menaka is accessing the home function which is present in father cass

        Father f=new Father();
        f.home();
        kavi k=new kavi();
        k.home();
    }

        class Father {
            void home()
            {
                System.out.println("1BHK");
            }

        }

        class kavi extends Father {
            void ka() {
                System.out.println("Kavitha");
            }
        }

        class menaka extends Father {
            void me() {
                System.out.println("menaka");
            }
        }

        class senthil extends Father {
            void se()
            {
                System.out.println("Senthil");
            }
        }
    }
