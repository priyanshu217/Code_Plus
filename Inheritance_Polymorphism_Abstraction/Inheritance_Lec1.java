package Inheritance_Polymorphism_Abstraction;
class Human1   // Parentclass or Super class
{
    int age;
    void sleep()
    {
        age=18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1    //Sub class or child class
{

}

public class Inheritance_Lec1 {
    public static void main(String[] args) {
        Student1 st=new Student1();

        st.sleep();

    }
}

