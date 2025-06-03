import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Creare array-uri cu cel putin 5 elemente
        int[] arr1 = {1, 7, 4, 3, 9, 1};
        int[] arr2 = {6, 4, 2, 8};
        
        // Afisare array-uri initiale
        System.out.print("Array1 initial: [");
        printArray(arr1);
        System.out.print("Array2 initial: [");
        printArray(arr2);
        
        // Sortare array-uri
        sortArray(arr1);
        sortArray(arr2);
        
        // Afisare array-uri sortate
        System.out.print("Array1 sortat crescator: [");
        printArray(arr1);
        System.out.print("Array2 sortat crescator: [");
        printArray(arr2);
        
        // Creare si populare array-ul final
        int[] mergedArray = mergeArrays(arr1, arr2);
        
        // Afisare array final
        System.out.print("Output: [");
        printArray(mergedArray);
    }
    
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k++] = arr1[i++];
            } else {
                result[k++] = arr2[j++];
            }
        }
        
        while (i < arr1.length) {
            result[k++] = arr1[i++];
        }
        
        while (j < arr2.length) {
            result[k++] = arr2[j++];
        }
        
        return result;
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }
} 