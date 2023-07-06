package Collection_and_Maps_API;

import java.util.*;

public class Array_List_Lec1 {
    public static void main(String[] args) {
        ArrayList al1=new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);
        System.out.println(al1);

        System.out.println("****************************************");

        ArrayList al2=new ArrayList();

        al2.add("Pw skills");
        al2.add(1);
        al2.add(2);
        al2.add(3);

        System.out.println(al2);

        System.out.println("****************************************");

        al2.add(100);

        System.out.println(al2);
        System.out.println("*****************************************");

        ArrayList al3=new ArrayList();

        al3.add(5);
        al3.add(6);
        System.out.println(al3);

        System.out.println("after adding collection");

        al3.addAll(al2);
        System.out.println(al3);

        al3.add("pw");
        System.out.println(al3);

    }
}
