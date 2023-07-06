package Collection_and_Maps_API;

import java.util.PriorityQueue;

public class Priority_Queue_Lec3 {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();

        pq.add(100);
        pq.add(50);
        pq.add(150);
        pq.add(25);
        pq.add(75);
        pq.add(125);
        pq.add(175);

        System.out.println(pq);
        pq.add(25);
        System.out.println(pq);
    }
}
