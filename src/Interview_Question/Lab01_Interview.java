package Interview_Question;

public class Lab01_Interview {
    public static void main(String[] args) {

        char ch = 'A';//in switch-> char varirable doesnot suport but chr is also a integer here
        switch(ch)
        {
            case 65:
                System.out.println(" match");
                break;
            case 64:
                System.out.println(" doesnot match");
            default:
                System.out.println("no ascii values");

        }

    }}
//Unsupported Data Types on switch:
//long
//
//float
//
//double
//
//boolean
//
//Object

//If you try to use an unsupported data type in switch, you will get a compilation error.
//Supported data types:
/*byte

short

char

int

String (Since Java 7)

enum (Since Java 5)

Wrapper Classes (Byte, Short, Character, Integer, String)*/