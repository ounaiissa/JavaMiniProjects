import java.util.Scanner;

import javax.print.event.PrintEvent;

class menu {

    static Scanner input = new Scanner(System.in);
    static int choix;
    public static float[] T = new float[10];

    public static void Saisie() {
        System.out.println("\n\t Saisie des nombres");
        System.out.println("\t-------------------------");
        for (int i = 0; i < T.length; i++) {
            System.out.print("Taper le nombre" + (i + 1) + ":");
            T[i] = input.nextFloat();
        }
    }

    public static void Affichage() {
        System.out.println("\n\t Affichage des nombres du tableau");
        System.out.println("\t---------------");
        for (int i = 0; i < T.length; i++) {
            System.out.println("le nombre " + (i + 1) + "est: " + T[i]);
        }
    }

    public static void Maximum() {
        float max = T[0];
        int maxPosition = 0;
        for (int i = 1; i < T.length; i++) {
            if (T[i] > max) {
                max = T[i];
                maxPosition = i;
            }
        }
        System.out.println("\n\t le nombre max est: " + max + "\n\t sa position est: " + maxPosition);
    }

    public static void Somme() {
        int sommeP = 0, sommeN = 0;
        int numP = 0, numN = 0, nul = 0;

        for (int i = 0; i < T.length; i++) {
            if (T[i] > 0) {
                sommeP += T[i];
                numP++;

            } else if (T[i] < 0) {
                sommeN += T[i];
                numN++;

            } else {
                nul++;
            }
        }
        System.out.println("la somme des nombres positifs est: " + sommeP + "\n\tet leur nombre est: " + numP
                + "\n\t et la somme des nombres negatifs est: " + sommeN + "\n\tet leur nombre est: " + numN
                + " la partie nul, il ya 2 valeurs: " + nul);
    }

    public static void Moyenne() {
        int S = 0;
        for (int i = 0; i < T.length; i++) {
            S += T[i];
        }

        System.out.println("la somme des nombres est: " + S + "leur moyenne est: " + S / T.length);
    }

    public static void Echange() {
        float e;
        for (int i = 0; i < T.length - 1; i++) {
            for (int j = i + 1; j < T.length; j++) {
                if (T[i] > T[j]) {
                    e = T[i];
                    T[i] = T[j];
                    T[j] = e;
                }
            }
        }
        System.out.println("Tableau avec succes");
    }

    public static void Selection() {
        float ech;
        int P;
        for (int i = 0; i < (T.length - 1); i++) {
            P = i;
            for (int j = (i + 1); j < T.length; j++) {
                if (T[P] > T[j]) {
                    P = j;
                }
            }
            // echange
            ech = T[P];
            T[P] = T[i];
            T[i] = ech;
        }
        System.out.println("Tableau tire avec succes");
    }

    public static void Trie() {
        float Ech;
        boolean echange;

        do {
            echange = false;
            for (int j = 0; j < (T.length - 1); j++) {
                if (T[j] > T[j + 1]) {
                    Ech = T[j];
                    T[j] = T[j + 1];
                    T[j + 1] = Ech;
                    echange = true;
                }
            }
        } while (echange = true);
        System.out.println("Tbaleau trie avec succes");
    }

    public static void Inverser() {
        int j = T.length - 1;
        float ECH;
        for (int i = 0; i < (T.length / 2); i++) {
            ECH = T[i];
            T[i] = T[j];
            j -= 1;
        }
    }

    public static void main(String[] args) {

        do {
            System.out.println("\n\t Menu Principal");
            System.out.println("\t-------------------------");
            System.out.println("Saisie===> 1 :");
            System.out.println("Affichage====> 2: ");
            System.out.println("Max===> 3:  ");
            System.out.println("Somme====> 4: ");
            System.out.println("Moyenne ===> 5: ");
            System.out.println("Echange du  tableau ===> 6:  ");
            System.out.println("Trie du tableau methode 2 ===> 7:  ");
            System.out.println("Trie du tableau methode 3 ===> 8:  ");
            System.out.println("Inverser le tableau  ===> 9:  ");
            System.out.println("Fin ===> 0 : ");
            System.out.println(" Taper votre Choix: ");
            choix = input.nextInt();

            switch (choix) {
                case 0: {
                    System.out.close();
                    break;
                }
                case 1: {
                    // System.out.println("1");
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
                    break;
                }
                case 5: {
                    Moyenne();
                    break;
                }
                case 6: {
                    Echange();
                    Affichage();
                    break;
                }
                case 7: {
                    Selection();
                    Affichage();
                    break;
                }
                case 8: {
                    Trie();
                    Affichage();
                    break;
                }
                case 9: {
                    Inverser();
                    break;
                }

            }
        } while (choix != 0);

    }
}