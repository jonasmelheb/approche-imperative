package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 nombres: ");
        int number = 0;
        int temp = 0;

        for (int i = 0; i < 4; i++) {
            number = scan.nextInt();

            if (number > temp) {
                temp = number;
            }
        }
        System.out.println("Le nombre le plus grand est: " + temp);
    }
}
