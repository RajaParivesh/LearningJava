// How to use Parallel Streams in Java 8
// Parallel streams divide the source into multiple sub-sources, 
// process them in parallel on multiple threads, and then combine the results.
// All stream function will also work in parallel streams.

package week1.Java8.LearningStream;
import java.util.*;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.parallelStream()
            .filter(i -> i % 2 == 0)
            .forEach(i -> System.out.println("Even Number: " + i + " - Thread: " + Thread.currentThread().getName()));
    }
    
}
