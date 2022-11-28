public class starpyramid {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 10; i++) {
            if (i < 10)
                System.out.print(i + " ");
            else
                System.out.print(i);
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        System.out.println("\n");

        for (i = 1; i <= 10; i++) {
            if (i < 10)
                System.out.print(i + " ");
            else
                System.out.print(i);
            for (j = 10; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}