package Introduction_to_API;
//functional interface
@FunctionalInterface
interface Demo
{
    void disp();
}
//this is parent class
@Deprecated
class Plane{
   public void planeFliesAtGoodHeight()
   {
       System.out.println("Planes is flying");
   }
}

//this is child class or subclass
class CargoPlane extends Plane{
    //overriden method from parent class
    public void planeFliesAtGoodHeight()
    {
        System.out.println("Cargo Plane flies at low");
    }
}

public class Anotation {
    public static void main(String[] args) {
        //object of child class
        Plane cp=new CargoPlane();
        cp.planeFliesAtGoodHeight();

    }
}
