public class hourglass {
    public static void main(String[] args) {
        byte i, j, E;

        for (i = 1; i <= 10; i++) {
            if (i < 10)
                System.out.print(i + " ");
            else
                System.out.print(i);
            for (E = 1; E <= i; E++) {
                System.out.print(" ");
            }

            for (j = 20; j > (2 * i - 1); j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 1; i <= 10; i++) {
            System.out.print(i);
            for (E = 11; E >= i; E--) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
