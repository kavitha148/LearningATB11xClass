package AccessModifier.police;

public class Jrcop {

    public static void main(String[] args) {
        cop jrcop=new cop(15);
        jrcop.canishoot();
        System.out.println(jrcop.gun);

        //default same as public if u dont mention any then its a default modifier
        //public can access by anyone
        //private access within the class, outside the class cant be accessible
        //protected will be access within the package



        /*public → everywhere

        private → only inside the class

        protected → same package + subclasses

        default → only in the same package*/
    }
}

