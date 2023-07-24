package Introduction_to_API;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Stream;

public class Introduction_to_steam_API {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(2,4,5,8,9);

        Stream<Integer> streamData=list.stream();
        long count=streamData.count();
        System.out.println(count);

        streamData.forEach(n1-> System.out.println(n1));
//        streamData.forEach(n-> System.out.println(n));  ------>>>> We can not execute both at time

    }
}
