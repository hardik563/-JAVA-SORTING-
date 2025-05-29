import java.util.*;
public class ArraysortingSelection {
    public static void selectionSort(int []arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minposition = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minposition] > arr[j]) {
                    minposition = j;
                }
            }
            //swapping of the value
            int temp = arr[minposition];
            arr[minposition] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArr(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String []args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ELEMENTS IN AN ARRAY:");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
        System.out.println("ARRAY AFTER SORTING THE ELEMENT BY SELECTION SORT:");
        selectionSort(arr);
        printArr(arr);
    }
}
