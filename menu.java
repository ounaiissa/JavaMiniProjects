import java.util.Scanner;

public class menu {
    public static int choix = 4;
    public static float[] T = new float[10];

    public static void Saisie() {
        System.out.println("Saisie");
    }

    public static void Affichage() {

    }

    public static void Maximum() {

    }

    public static void Somme() {

    }

    public static void Moyenne() {

    }

    public static void Trie() {

    }

    public static void Inverse() {

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (choix != 0) {
            System.out.println("Saisie===> 1 :");
            System.out.println("Affichage====> 2: ");
            System.out.println("Max===> 3:  ");
            System.out.println("Somme====> 4: ");
            System.out.println("Moyenne ===> 5: ");
            System.out.println("Trie le tableau ===> 6:  ");
            System.out.println("Inverser le tableau ===> 7:  ");
            System.out.println("Fin ===> 0 : ");
            System.out.println(" Taper votre Choix: ");
            choix = input.nextInt();

            switch (choix) {
                case 1: {
                    Saisie();
                    break;
                }
                case 2: {
                    Affichage();
                    break;
                }
                case 3: {
                    Maximum();
                    break;
                }
                case 4: {
                    Somme();
                    ;
                    break;
                }
                case 5: {
                    Trie();
                    ;
                    break;
                }
                case 6: {
                    Inverse();
                    break;
                }

            }
        }
    }
}