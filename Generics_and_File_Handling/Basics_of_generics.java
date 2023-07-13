package Generics_and_File_Handling;
import java.util.*;

 class Gen<T>
 {
     T obj;
     public Gen(T obj)
     {
         this.obj=obj;
     }
     void disp()
     {
         System.out.println("The type of data is :" + obj.getClass().getName());
     }
     public T getObj()
     {
         return obj;
     }
 }
public class Basics_of_generics {
    public static void main(String[] args) {

        Gen<Integer> g=new Gen<Integer>(10);
        g.disp();
        System.out.println(g.getObj());

//        ArrayList<String> list1=new ArrayList<String>();
//
//        List<String> list2=new ArrayList<String>();
//
//        Collection<Integer> list3=new ArrayList<Integer>();
//
//         List<Object> list4=new ArrayList<String>():  -->  COMPILE TIME ERROR <--
//
//        List<Integer> list5=new ArrayList<Integer>();
//
//        List<int> list6=new ArrayList<int>();




        



    }
}
