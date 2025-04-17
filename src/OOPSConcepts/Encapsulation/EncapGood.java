package OOPSConcepts.Encapsulation;

//if u ryt click on private variable name and selct generate->getter and setter then it will create the code for getter setter for the variable which u selected

public class EncapGood {


    public static void main(String[] args) {


        login v = new login("Kavi","123"); //here v is a obj

        //String a =login.password;//we cannot access this password as its accessible only in login class not in main class as its mentioned as private


        //if we want to change the username and password in encapsulation then we can use getter and setter method as below

        System.out.println(v.getUsername());//-->now we can acess the username in main class frm subclass..it prints their own username as kavi

        v.setUsername("prabu");//-->if we want to change the username we can change the previous username kavi to prabu by using obj and setusername method
        System.out.println(v.getUsername());

        System.out.println(v.getPassword());//it prints the first password  which mentioned inside the parameter in object creation;own password as output

        v.setPassword("456");//i set the password
        System.out.println(v.getPassword());//it prints the new password which i set
    }
}

class login
{
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String username;//private cant be accessed outside of the class
    private String password;


    login(String usr, String pwd)
    {
        this.username=usr;
        this.password=pwd;
    }

}