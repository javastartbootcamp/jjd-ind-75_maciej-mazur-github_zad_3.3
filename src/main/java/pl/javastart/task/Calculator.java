package pl.javastart.task;

public class Calculator {
    boolean isEven(int arg) {
        return arg % 2 == 0;
    }

    boolean isOdd(int arg) {
        return !isEven(arg);
    }

    double circleField(double radius) {
        return 3.14 * radius * radius;
    }

    int power(int arg) {
        return arg * arg;
    }
}
