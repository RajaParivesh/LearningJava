package week1.Java8.LearningStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertStreamIntoCollection {
    // How to convert Streams into various data structures in Java 8

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,5,6,6,676);

        // Converting List to Stream and back to List after applying some operations
        List<Integer> l1 = list.stream()
                            .map(x->x+10)
                            .sorted((a,b)->(b-a))
                            .peek(x-> System.out.println("Value is: " + x)) // intermediate operation to see the values
                            .limit(4)
                            .skip(1)
                            .distinct()
                            .collect(Collectors.toList());
        System.out.println(l1);

        Stream.iterate(0, x-> x+1)
                .limit(101)
                .skip(1)
                .forEach(System.out::println);
               
    }
}
