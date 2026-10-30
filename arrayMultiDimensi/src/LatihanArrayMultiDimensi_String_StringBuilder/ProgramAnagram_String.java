package LatihanArrayMultiDimensi_String_StringBuilder;

import java.util.Arrays;

public class ProgramAnagram_String {
    public static void main(String[] args) {
        String kata1 = "Listen".toLowerCase();
        String kata2 = "Silent".toLowerCase();

        char[] array1 = kata1.toCharArray();
        char[] array2 = kata2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        boolean isAnagram = Arrays.equals(array1, array2);
        System.out.println("Apakah Anagram? " + isAnagram);
    }
}
