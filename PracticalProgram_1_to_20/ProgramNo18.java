import java.util.Arrays;

public class ProgramNo18 {
    public static void main(String[] args) {
        String[] names = {"Zayan", "Amit", "Rahul", "Vikas", "Bina", "Priya"};
        System.out.println("Before Sorting: " + Arrays.toString(names));
        // Call quicksort on the entire array
        quickSort(names, 0, names.length - 1);
        System.out.println("After Sorting:  " + Arrays.toString(names));
    }

    // Main QuickSort function
    public static void quickSort(String[] arr, int low, int high) {
        if (low < high) {
            // partitionIndex is the index where the pivot is now in the right place
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(String[] arr, int low, int high) {
        // We pick the last name as the pivot
        String pivot = arr[high];
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // Compare current string with pivot alphabetically
            // compareTo returns < 0 if arr[j] comes before pivot
            if (arr[j].compareTo(pivot) < 0) {
                i++;

                // Swap arr[i] and arr[j]
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap the pivot element with the element at i+1
        String temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}