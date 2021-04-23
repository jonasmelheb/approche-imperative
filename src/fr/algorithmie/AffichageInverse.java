package fr.algorithmie;

public class AffichageInverse {
	public static void main (String[] args) {
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
		
		System.out.println("Réponse 1:");
        
		// Afficher le tableau
		for(int number = 0; number <= array.length - 1; number++) {
        	int numberList = array[number];
        	
            System.out.print(numberList + ", ");
        }
        
        System.out.println("\n\nRéponse 2:");
        
        // Afficher le tableau en inverse
        for(int number = array.length - 1; number >= 0; number--) {
        	int numberListRevers = array[number];
        	
            System.out.print(numberListRevers + ", ");
        }
        
        System.out.println("\n\nRéponse 3:");
        
        // Faire et afficher un ArrayCopy
        int[] arrayCopy = new int[array.length];
        
        for (int i = 0; i < arrayCopy.length; i++) {
        	arrayCopy[i] = array[i];
        	int numberListNewArray = arrayCopy[i];
        	System.out.print(numberListNewArray + ", ");
         }
        
	}
}
