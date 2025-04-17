package AccessModifier;

public class modifierExample {


    public class Student {
        public String name;
        private int age;
        protected String grade;
        String school; // default

        /* Access:
name → everywhere

age → only inside Student class

grade → same package + subclasses

school → only in the same package*/
    }
}


