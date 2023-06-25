package Inheritance_Polymorphism_Abstraction;
class Aeroplane1
{
    public void takeofff()
    {
        System.out.println("Aeroplane is takingoff");
    }
    public void flyy()
    {
        System.out.println("Aeroplane is flying");
    }
}
class  Carogoplanee extends Aeroplane1
{
    public void flyy()
    {
        System.out.println("Cargoplane is badass");      //Overidding
    }
    public void carryfoodd()                      //Specialized
    {
        System.out.println("Carry goods");
    }
}
class  Passengerplanee extends Aeroplane1
{
    public void takeofff() {
        System.out.println("passenger plane require medium size");
    }

    public void flyy()           //Overriddeng
    {
        System.out.println("Passengerplane is badass");
    }
}

    class Fighterplanee extends Aeroplane1
    {
        public void takeofff() {
            System.out.println("Fighterplane require small size");

        }

        public void fly() {
            System.out.println("Fighter plane flies at high height");
        }
    }


public class Polymorphism_Lec6 {
    public static void main(String[] args) {
        Carogoplanee cpp=new Carogoplanee();
        Passengerplanee ppp=new Passengerplanee();
        Aeroplane1 ref;
        ref=cpp;
        ref.takeofff();
        ref.flyy();

        System.out.println("....................");

        ref=ppp;

        ref.takeofff();
        ref.flyy();



    }
}
