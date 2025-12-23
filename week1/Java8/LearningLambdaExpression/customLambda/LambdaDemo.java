package week1.Java8.LearningLambdaExpression.customLambda;

public class LambdaDemo {
    public static void main(String[] args) {
    
        Employee sde = () -> "Raja";  // With the help of lambda expression, we can directly provide the implementation of the abstract method of functional interface
        System.out.println(sde.getName());

        Employee hr = () -> "Suresh";
        System.out.println(hr.getName());
    }
}
