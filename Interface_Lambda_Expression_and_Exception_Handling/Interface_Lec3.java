package Interface_Lambda_Expression_and_Exception_Handling;

 interface Computer
{
     void compileCode();

}
class Laptop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors");

    }
}
class Desktop implements Computer
{
    public void compileCode()
    {
        System.out.println("You got 5 errors faster");

    }
}
class Developer  {

    public void buildApp(Computer obj1)
    {
        System.out.println("Building app");

        obj1.compileCode();
    }
}

public class Interface_Lec3 {
    public static void main(String[] args) {
      //  Laptop obj1 = new Laptop();
        Desktop obj1 = new Desktop();
        Developer Dev= new Developer();
        Dev.buildApp(obj1);

    }
}
