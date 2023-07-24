package Introduction_to_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class More_on_Stream_API {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,4,5,8,9);

        Stream<Integer> streamData=list.stream();

        streamData.forEach(n-> System.out.println(n));
//        streamData.forEach(n-> System.out.println(n));  ------>>>> We can not execute both at time
        
    }
}
