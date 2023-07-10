package Collection_and_Maps_API;

import java.util.TreeSet;

public class TreeSet_Lec4 {
    public static void main(String[] args) {

        TreeSet ts=new TreeSet();
        ts.add(100);
        ts.add(50);
        ts.add(150);
        ts.add(25);
        ts.add(75);
        ts.add(125);
        ts.add(175);

        System.out.println(ts);
         ts.add(100);                      // No duplicate is allowed
         System.out.println(ts);

        System.out.println(ts.higher(50));
        System.out.println(ts.higher(50));

        System.out.println(ts.lower(40));
        System.out.println(ts.lower(40));

        System.out.println(ts.ceiling(50));
        System.out.println(ts.floor(50));


    }
}
