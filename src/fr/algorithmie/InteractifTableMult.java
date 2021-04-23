package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        System.out.print("Enter un nombre entre 1 et 10: ");
        number = scan.nextInt();
        do {
            System.out.print("Recommencez: ");
            number = scan.nextInt();
        } while ((number < 1) || (number > 10));

        System.out.println("La table de "+  number + ": " );

        for (int i = 0; i <= 10; i++) {
            int multiTab = number * i;
            System.out.println(number + " * " + i + " = " + multiTab);
        }
    }
}
