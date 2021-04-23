package fr.algorithmie;

public class FirstLast6 {
    public static void main (String[] args) {
        int[] array = {};
        boolean bool = false;

        if (array.length != 0 && ((array[0] == 6) || (array[array.length - 1 ] == 6))) {
            bool = true;
        }
        System.out.println(bool);
    }
}
