package Collection_and_Maps_API;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSet_Lec5 {
    public static void main(String[] args) {

        HashSet hs=new HashSet();
        hs.add(100);
        hs.add(20);
        hs.add(10);
        hs.add(5);
        hs.add(2);

        System.out.println(hs);
        LinkedHashSet hs1=new LinkedHashSet();
        hs1.add(100);
        hs1.add(20);
        hs1.add(10);
        hs1.add(5);
        hs1.add(2);

        System.out.println(hs1);

    }
}
