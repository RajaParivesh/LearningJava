// How to use Streams in Java 8
package week1.Java8.LearningStream;

import java.util.Arrays;

public class Stream {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        // imperative approach
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        // Output : 25

        // using streams - declarative approach
        int sum2 = Arrays.stream(arr)
                .filter(item -> item % 2 == 0).sum(); // filter even numbers
        System.out.println(sum2);
        // Output : 30
    }
}


// NOTE:  There is a difference in the output because for loop works on index basis whereas stream works on value basis.

// 🎯 Key takeaway (VERY IMPORTANT)
// Approach	What is checked
// for loop	Index (i)
// stream()	Value (i)
