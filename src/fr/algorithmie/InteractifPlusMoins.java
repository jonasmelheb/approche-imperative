package fr.algorithmie;

import java.util.Random;
import java.util.Scanner;

public class InteractifPlusMoins {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100);
        System.out.println(randomNumber);
        int number = 0;
        int attempt = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter un nombre entre 0 et 100: ");
        number = scan.nextInt();

        while (number != randomNumber) {
            if (number > randomNumber) {
                System.out.println("Moins ");
                number = scan.nextInt();
                attempt++ ;
            } else if (number < randomNumber) {
                System.out.println("Plus");
                number = scan.nextInt();
                attempt++;
            }
        }
        System.out.println("Bravo, vous avez  trouvé en " + attempt + " coups");
    }
}
