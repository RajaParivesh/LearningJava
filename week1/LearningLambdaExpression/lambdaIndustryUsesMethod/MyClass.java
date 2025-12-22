// // Without lambda expression
// package week1.lambdaIndustryUsesMethod;

// public class MyClass implements Runnable {
//     @Override
//     public void run() { // Implementing the run method of Runnable interface
//         System.out.println("Task is running in a separate thread.");    
//     }
//     public static void main(String[] args) {
//         // Creating a thread with the Runnable task
//         Thread thread = new Thread(new MyClass());

//         thread.start();
//     }

// }


// With lambda expression
package week1.LearningLambdaExpression.lambdaIndustryUsesMethod;

public class MyClass {
    public static void main(String[] args) {
        // Using lambda expression to implement the Runnable interface
        Runnable task1 = () -> {
            System.out.println("Task is running in a separate thread.");
        };
        Runnable task2 = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Count: " + i);
            }
        };

        // Creating a thread with the Runnable task
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();
    }
}