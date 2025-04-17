package AccessModifier.criminal;

import AccessModifier.police.cop;

public class thief {


    public static void main(String[] args)
    {
        cop c= new cop(9);
       // c.canishoot();//canishoot method values printed bcz this is public, if we mentioned private in police package cop class then it throws error

       //if u mention protected also then it wont access here as its in a diff package
        System.out.println(c.gun);


    }
}




