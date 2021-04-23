package fr.algorithmie;

public class InversionContenu {

	public static void main(String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Réponse 1:");
		
		// Afficher le tableau
		for (int i = 0; i < array.length; i++) {
        	int numberList = array[i];
        	System.out.print(numberList + ", ");
         }
		
		int[] arrayCopy = new int[array.length];

		
		// Copie le tableau en inverse dans un autre tableau
		int newIndex = arrayCopy.length - 1;
        for (int i = 0; i < array.length; i++) {
        	arrayCopy[newIndex] = array[i];
        	newIndex--;
         }

		System.out.println("\n\nRéponse 2:");

        // Afficher le tableau
		for (int i = 0; i < arrayCopy.length; i++) {
			int numberListNewArray = arrayCopy[i];
			System.out.print(numberListNewArray + ", ");
		}

	}
}
