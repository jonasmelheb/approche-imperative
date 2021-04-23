package fr.algorithmie;

public class Rotation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int last = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        System.out.println("Array after right rotation: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
