package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int[] tab = new int[0];
        int count = 0;
        boolean stop = false;
        while (!stop) {
            System.out.println(
                    "Veuillez sélectionner : \n 1. Ajouter un nombre \n 2. Afficher les nombres existants \n 3. Arrêter");
            int choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    System.out.println("Vous avez choisi d'ajouter un nombre, veuillez renseigner votre nombre :");
                    int nouveauNombre = scanner.nextInt();
                    tab = Arrays.copyOf(tab, tab.length +1);
                    tab[count] = nouveauNombre;
                    count++;
                    break;

                case 2:
                    System.out.println("Vous avez choisi d'afficher le tableau :");
                    System.out.println(Arrays.toString(tab));
                    break;

                case 3:
                    stop = true;
                    System.out.println("Vous avez arrêté le programme");
                    break;

                default:
                    System.out.println(
                            "Oups, vous n'avez pas rentré un chiffre valide...");
            }
        }
    }
}