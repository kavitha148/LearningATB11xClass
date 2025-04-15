package Polymorphism;

public class overriding {


    //it wil be decided at runtime->dynamic->runtime polymorphism

    //parent also has some function and sub class overridng it
    //father has home which is 1 bhk and i extended/moderated it to 3bhk
    //same method in diff class

    public static void main(String[] args)
{
        plant a= new plant();
        a.dog();

    }}

    class Animal
    {
        void dog()
        {
            System.out.println("Dog barking");
        }

    }
        class plant extends Animal
        {
            void hibiscus()//own method of plant
            {
                System.out.println("plant grows");
            }

            @Override
            void dog()
            {
                System.out.println("dog barks nearby plant");
            }
        }


