package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter un nombre: ");
        int number = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i++) {
            sum += i;
        }
        System.out.println(" " + sum);

    }
}
