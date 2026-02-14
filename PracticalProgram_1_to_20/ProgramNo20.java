import java.util.Arrays;
import java.util.LinkedHashSet;

public class ProgramNo20 {
    // Method 1: Remove duplicates from SORTED array (Two-pointer technique)
    public static int removeDuplicatesSorted(int[] arr) {
        if (arr.length == 0) return 0;

        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length - 1];
        return j;
    }
    // Method 2: Remove duplicates from UNSORTED array (LinkedHashSet)
    public static Integer[] removeDuplicatesUnsorted(Integer[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(arr));
        return set.toArray(new Integer[0]);
    }
    public static void main(String[] args) {
        // Sorted array
        int[] sortedArr = {10, 20, 20, 30, 30, 40, 50, 50};

        // Unsorted array
        Integer[] unsortedArr = {5, 1, 2, 6, 4, 2, 1, 3, 5};

        // ---- Sorted Method ----
        int newLength = removeDuplicatesSorted(sortedArr);
        System.out.print("Sorted Array after removal: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(sortedArr[i] + " ");
        }
        // ---- Unsorted Method ----
        Integer[] uniqueArr = removeDuplicatesUnsorted(unsortedArr);
        System.out.println("\nUnsorted Array after removal: " + Arrays.toString(uniqueArr));
    }
}
