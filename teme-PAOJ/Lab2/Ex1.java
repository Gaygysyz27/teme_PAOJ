import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        // Citire numar intre 0 si 5
        do {
            System.out.print("Introduceti un numar intre 0 si 5: ");
            n = scanner.nextInt();
        } while (n < 0 || n > 5);
        
        // Creare si populare array
        int[] arr = new int[n];
        System.out.println("Introduceti " + n + " numere:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Afisare array initial
        System.out.print("Array initial: [");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n-1) System.out.print(", ");
        }
        System.out.println("]");
        
        // Inversare si afisare
        reverseArray(arr);
        
        scanner.close();
    }
    
    public static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        System.out.print("Array inversat: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length-1) System.out.print(", ");
        }
        System.out.println("]");
    }
} 