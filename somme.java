import java.util.Scanner;

public class somme {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float num1, num2, S;

        System.out.println("Enter first number: ");
        num1 = input.nextFloat();
        System.out.println("Enter second number: ");
        num2 = input.nextFloat();

        S = num1 + num2;

        System.out.println(" la somme est:" + S);
    }
}

