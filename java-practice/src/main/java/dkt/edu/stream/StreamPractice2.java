package dkt.edu.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPractice2 {
    public static void main(String[] args){
        String[] strArr = new String[]{"tomato", "banana", "orange", "melon", "watermelon"};

        System.out.println(Arrays.toString(strArr));
        String fruitStr = Arrays.stream(strArr).collect(Collectors.joining(","));
        System.out.println(fruitStr);
        List<String> unmodifiable = Stream.of("foo", "bar").toList();
        List<String> list = Stream.of(strArr).toList();
        System.out.println(unmodifiable);
        System.out.println(list);
    }

}
