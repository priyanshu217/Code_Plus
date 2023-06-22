package pwskills;

public class Conditionals {
    public static void main(String[] args) {
//        int age = 15;
//        if(age >= 18)
//        {
//            System.out.println("you are adult");
//        }
//        else
//        {
//            System.out.println("you are kiddo");
//        }

        //if , else if , else

//        int age = 53;
//        if (age >= 18 && age < 60)
//        {
//            System.out.println("you're adult");
//        }
//        else if (age >= 60)
//        {
//            System.out.println("you're old");
//        }
//        else
//        {
//            System.out.println("you're kiddo");
//        }

        // Nested if else
        int age = 98;
        if (age >=18 && age <60)
        {
            if(age >=20 && age >25)
            {
                System.out.println("you're in twenties");
            }

            else if (age >60)
            {
                System.out.println("get off");
            }
            else
            {
                System.out.println("nothing");
            }
        }
        else if( age <= 60)
        {
            System.out.println("you're old");
        }
        else if(age >= 90)
        {
            System.out.println("you're super old");
        }
        else
        {
            System.out.println("you're kiddo");
        }
    }
}
