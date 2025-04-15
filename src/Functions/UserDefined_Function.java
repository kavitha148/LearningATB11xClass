package Functions;

public class UserDefined_Function {
    public static void main(String[] args) {
        /* 4 functions
        without parameter without return type
        without parameter with return type
        with parameter without returntype
        with parameter with returntype

        -->parameter/arguments->input to function
        -->returntype->which datatype it will return

        doesnot return(void function) means we cannot assign that as a value to any variable

        Main purpose of creating a methods is reusability
         */

//with args with return type function
    int result= sum_oftwo_number(3,4);
      System.out.println(result);

    }
     static int sum_oftwo_number(int a, int b)//with args and with return type
        {
            return a+b;

        }

    }

