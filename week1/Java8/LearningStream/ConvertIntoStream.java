// How to convert various data structures into Streams in Java 8
package week1.Java8.LearningStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
import java.util.Stack;

public class ConvertIntoStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D", "AB");

        // Converting List to stream
        Stream<String> streamFromList = list.stream(); 
        streamFromList.filter(s -> s.startsWith("A")).forEach(System.out::println);
        
        //-------------------------------------------------------------------- 
        String arr[] = { "X", "Y", "Z", "XY", "YZ" };

        // Converting Array to stream
        Stream<String> streamFromArray = Arrays.stream(arr);
        streamFromArray.map(item -> item + "--------X").forEach(System.out::println);

        //-------------------------------------------------------------------- 

        Stack<String> stack = new Stack<>();
        stack.push("P");
        stack.push("Q");
        stack.push("R");
        stack.push("R");
        stack.push("R");
        stack.push("R");

        // Converting Stack to stream
        Stream<String> streamFromStack = stack.stream(); 
        long count = streamFromStack
                .filter(item -> item.equals("R"))
                .count();

        System.out.println(count);

        //-------------------------------------------------------------------- 
        // Generating stream using Stream.of()
        Stream<Integer> streamOfIntegers = Stream.of(1,2,3,4,5,6,7,8,9,10);
        streamOfIntegers.map(i-> i*10).forEach(System.out::println);


        // Generating infinite stream using Stream.iterate()
        Stream<String> infiniteStream = Stream.iterate("Hello", s -> s + "!");
        infiniteStream.limit(5).forEach(System.out::println); // Limiting to first
    }
}

