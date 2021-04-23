package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

// Exo pas fini
public class InteractifStockageNombre {
    public static void main(String[] args) {
        int choice = 0;
        int number = 0;
        int[] array = new int[4];

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("--Menu--");
            System.out.println("1. Ajouter un nombre : tapez 1");
            System.out.println("2. Afficher les nombres existants : tapez 2");
            choice = scan.nextInt();
        } while (choice != 2 && choice != 1);

        switch (choice) {
            case 1:
                System.out.print("Enter un nombre : ");
                number = scan.nextInt();
                array[0] = number;
                System.out.println("Voulez vous afficher le tableau ? Tapez 2");
                choice = scan.nextInt();
                break;
            case 2:
                System.out.println("Voici le tableau : ");
                System.out.println(Arrays.toString(array));
                break;
        }


    }
}
