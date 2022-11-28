import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1, num2, num3, max, min;

        System.out.println("Enter first number: ");
        num1 = input.nextFloat();
        System.out.println("Enter second number: ");
        num2 = input.nextFloat();
        System.out.println("Enter third number: ");
        num3 = input.nextFloat();

        if (num1 < num2) {
            max = num2;
            min = num1;
        } else {
            max = num1;
            min = num2;
        }
        if (num3 > max)
            max = num3;
        if (num3 < min)
            min = num3;

        System.out.println(" minimum value is: " + min);
        System.out.println(" maximum value is: " + max);
    }
}
