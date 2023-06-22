package Inheritance_Polymorphism_Abstraction;

class Human
{
    String name;        //Constructors and private members do not participate in inheritance
    int age;
    Human()
    {
        System.out.println("Human class constructor");
    }
    void sleep()
    {
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class student extends Human
{
void disp()
{
    System.out.println("The age is :"+ age);
   // System.out.println("The Name is:" + name);
}
}
public class Inheritance_Lec2 {
    public static void main(String[] args) {
        student st=new student();
        st.sleep();
        st.disp();

    }
}
