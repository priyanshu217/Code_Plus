package Inheritance_Polymorphism_Abstraction;

import org.w3c.dom.ls.LSOutput;

class strawhats
{
    public void Captain()
    {
        System.out.println("Luffy");
    }
    public void member()
    {
        System.out.println("luffy is also crew member");
    }
}
class girls extends strawhats
{
    public void nami()
    {
        System.out.println("navigator");
    }
    public void member()
    {
        System.out.println("nami is also crew member");
    }

}
class chef extends strawhats
{
    public void blackfoot()
    {
        System.out.println("sanji");
    }
    public void food()
    {
        System.out.println(" sanji makes good food");
    }
}
class naruto extends strawhats
{
    public void member()
    {
        System.out.println("Naruto is not a member");
    }
    public void zoro()
    {
        System.out.println("zoro is member");
    }
}


public class Abstraction_Lec8 {
    public static void main(String[] args) {

        girls g=new girls();
        strawhats s=new strawhats();
        chef c=new chef();
        naruto n=new naruto();
        n.member();
        n.zoro();



    }
}
