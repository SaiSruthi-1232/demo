package demo.calculator;
import demo.calculator.Calci;
public class Calculator {
    public static void main(String args[]) {
        Calci obj = new Calci();
        System.out.println("Sum of values: " + obj.sum(2, 3));
        System.out.println("Product of values: " + obj.product(2, 3));
        System.out.println("Largest value: " + obj.large(2, 3));
        System.out.print("Value is odd or even: ");
        obj.findOddOrEven(5);
    }
}
