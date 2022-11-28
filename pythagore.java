import java.util.Scanner;
import java.math.*;

public class pythagore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a, b;
        double c;

        System.out.println("Enter a:");
        a = input.nextFloat();
        System.out.println("Enter b: ");
        b = input.nextFloat();

        // c = Math.sqrt(a * a + b * b);
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.print("la valeur de l'hypotheneuse est: " + c);
    }
}
