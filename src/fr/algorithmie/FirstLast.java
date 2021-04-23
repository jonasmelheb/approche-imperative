package fr.algorithmie;

public class FirstLast {
    public static void main (String[] args) {
        int[] array = {2,2};
        boolean bool = false;

        if (array.length != 0 && (array[0] == array[array.length - 1 ])) {
            bool = true;
        }
        System.out.println(bool);
    }
}
