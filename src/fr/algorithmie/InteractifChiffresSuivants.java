package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter un nombre: ");
        int number = scan.nextInt();

        for (int i = 0; i < 10; i++) {
            number++;
            System.out.print(" " + number);
        }
    }
}
