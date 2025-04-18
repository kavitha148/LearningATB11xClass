package OOPSConcepts.Static;

import org.w3c.dom.ls.LSOutput;

import java.util.PrimitiveIterator;

public class StaticQuestions {
    public static void main(String[] args)

    {


//obj creation for laddu class
laddu l=new laddu();

//normal variables methods calling as below thru obj ref name
l.setName("Kavitha");
System.out.println(l.getName());
l.setPhoneno(789);
System.out.println(l.getPhoneno());
l.assignmentcontent();

// below three are static hence called via classname
laddu.doassignment();
System.out.println(laddu.Housename);
System.out.println(laddu.coursename);


    }

}

class laddu {
    {
        System.out.println("this is called when obj created i.e.IIb block");

        //here we can write anythign that we need to start the project
        //start a website or anything for automation
    }

    static
    {
        System.out.println("whenever load the class static will be called at first and called once thruout the program");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }

    private String name; //not static
    private int phoneno;
    static  String coursename="Javaclass";
    static String Housename ="Nishanth home";


    static void doassignment()
    {
        System.out.println("Student had to do the assignment");
    }

    void assignmentcontent()
    {
        System.out.println("assignment content is different for each person");
    }
}