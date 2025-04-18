package OOPSConcepts.Constructor;

public class ConRealEx {

    public static void main(String[] args) {

        //obj for param constructor
        person p= new person("prabu",89,"23-B","142733");
        System.out.println(p.name);

        //default constructor obj creation

        person ps= new person();
        System.out.println(ps.Address);
    }
}

    class person
    {    String name;
        int phoneno;
        String Address;
        String Employeeid;

        //Default constructor
        person()
        {
            name="kavi";
            phoneno=78119;
            Address="22-B";
            Employeeid="148633";
        }
        //param constructor -> its used to initialize the values for instance variables during object creation
        person(String name_param, int Phone_param, String Address_param,String Empoyeeid_param)
        {
            this.name=name_param;
            this.phoneno=Phone_param;
            this.Address=Address_param;
            this.Employeeid=Empoyeeid_param;

        }
    }
