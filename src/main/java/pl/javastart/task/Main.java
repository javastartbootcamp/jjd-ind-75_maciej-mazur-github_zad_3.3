package pl.javastart.task;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("Czy liczba 5 jest parzysta? " + calculator.isEven(5));
        System.out.println("Czy liczba 4 jest nieparzysta? " + calculator.isOdd(4));
        System.out.println("===========================");
        System.out.println("Pole koła o promieniu 5.25: " + calculator.circleField(5.25));
        System.out.println("Kwadrat liczby 10 to: " + calculator.power(10));
    }
}
