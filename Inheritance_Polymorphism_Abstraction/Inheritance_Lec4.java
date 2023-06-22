package Inheritance_Polymorphism_Abstraction;
class Aeroplane
{
    public void takeoff()
    {
        System.out.println("Aeroplane is takingoff");
    }
    public void fly()
    {
        System.out.println("Aeroplane is flying");
    }
}
class  Carogoplane extends Aeroplane
{
    public void fly()
    {
        System.out.println("Cargoplane is badass");      //Overidding
    }
    public void carryfood()                      //Specialized
    {
        System.out.println("Carry goods");
    }
}
class  Passengerplane extends Aeroplane
{
    public void fly()           //Overriddeng
    {
        System.out.println("Passengerplane is badass");
    }

}
public class Inheritance_Lec4 {
    public static void main(String[] args) {
        Carogoplane cp=new Carogoplane();
        Passengerplane pp=new Passengerplane();
        pp.takeoff();
        pp.fly();
        cp.takeoff();
        cp.fly();
    }
}
