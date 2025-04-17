package AccessModifier.police;

public class cop {

    public int gun;
        String icard;

      public  cop( int bullet) //constructor
        {
            this.gun=bullet;


    }
    //normal method
    //public void canishoot()
   // private void canishoot()
    protected void canishoot()
    {
        System.out.println("yes you can shoot!");
    }
}





