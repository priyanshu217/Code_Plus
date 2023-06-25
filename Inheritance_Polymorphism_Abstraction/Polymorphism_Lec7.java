package Inheritance_Polymorphism_Abstraction;
class Aeroplane2
        {
public void takeoff1()
        {
        System.out.println("Aeroplane is takingoff");
        }
public void fly1()
        {
        System.out.println("Aeroplane is flying");
        }
        }
class  Carogoplane1 extends Aeroplane2
{
    public void fly1()
    {
        System.out.println("Cargoplane is badass");      //Overidding
    }
    public void carryfood1()                      //Specialized
    {
        System.out.println("Carry goods");
    }
}
class  Passengerplane1 extends Aeroplane2
{
    public void takeoff1() {
        System.out.println("passenger plane require medium size");
    }

    public void fly1()           //Overriddeng
    {
        System.out.println("Passengerplane is badass");
    }
}

class Fighterplane1 extends Aeroplane2
{
    public void takeoff1()
    {
        System.out.println("Fighterplane require small size");

    }

    public void fly1()
    {
        System.out.println("Fighter plane flies at high height");
    }
}
class Airport
{
    public void poly(Aeroplane2 ref)
    {
        ref.takeoff1();
        ref.fly1();

        System.out.println(".........................");
    }

}


public class Polymorphism_Lec7 {
    public static void main(String[] args) {
        Carogoplane1 ca=new Carogoplane1();
        Passengerplane1 Pa=new Passengerplane1();
        Fighterplane1 Fi=new Fighterplane1();

        Airport a=new Airport();
        a.poly(ca);
        a.poly(Pa);
        a.poly(Fi);


//        ca.takeoff1();
//        ca.fly1();
//
//        Pa.takeoff1();
//        Pa.fly1();
//
//        Fi.takeoff1();
//        Fi.fly1();

    }
}
