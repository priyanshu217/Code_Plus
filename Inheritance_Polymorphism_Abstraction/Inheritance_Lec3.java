package Inheritance_Polymorphism_Abstraction;
             //Type of inheritance
                                                   // 1.Singllevel inheritance
class Demo1
             {
                 void disp()
                 {
                     System.out.println("display method writtern in class first");

                 }
             }
             class Demo2 extends Demo1
             {

             }

                                                 // 2.multilevel inheritance
class Demo3 extends Demo2
                                                 {

                                                 }



                                                 // 3.Hearical inheritance  - One parent class and multiple sub class
class Animal
                                                 {
                                                     void sleep()
                                                     {
                                                         System.out.println("Animal is agressive");
                                                     }
                                                 }
                                                 class Tiger extends Animal
                                                 {

                                                 }
                                                 class Monkey extends Animal
                                                 {

                                                 }
                                                 class Birds extends Animal
                                                 {

                                                 }

                                                  // 4. Multipla inhertance  or Dimond shape problems
           //  Not allowed in Java

public class Inheritance_Lec3 {
    public static void main(String[] args) {
      //  Demo2 d=new Demo2();
      //  Demo3 d1=new Demo3();
      //  d1.disp();
        Tiger t=new Tiger();
        t.sleep();


    }
}
