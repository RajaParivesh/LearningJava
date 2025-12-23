package week1.Java8.LearningLambdaExpression.customLambda;

@FunctionalInterface
public interface Employee {
    // Make sure there is only one abstract method -> then only it can be implemented using lambda
    String getName();
}