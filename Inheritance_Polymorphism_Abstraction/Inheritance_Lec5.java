package Inheritance_Polymorphism_Abstraction;
class Demoo1
{
 int a,b;
 public Demoo1()
 {
     System.out.println("Parent class constructor");
 }
 public Demoo1(int x , int y)
 {
     System.out.println("Parmeterize parent class constructor");
     a=x;
     b=y;
 }
}
class Demoo2 extends Demoo1
{
    int m,n;
    public Demoo2()
    {
        System.out.println("Chlid class constructor");
    }
    public Demoo2(int x, int y)
    {
        System.out.println("parametrised child class constructor");
        m=x;
        n=y;
    }
}

public class Inheritance_Lec5 {
    public static void main(String[] args) {
     Demoo2 d=new Demoo2(20,30);

    }
}
