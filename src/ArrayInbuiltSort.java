import java.util.*;
import java.util.Arrays;
public class ArrayInbuiltSort {
        public static void printArr(int arr[]) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String args[]) {
            int arr[] = new int[5];
            Scanner sc = new Scanner(System.in);
            System.out.println("ENTER ELEMENTS IN AN ARRAY:");
            arr[0] = sc.nextInt();
            arr[1] = sc.nextInt();
            arr[2] = sc.nextInt();
            arr[3] = sc.nextInt();
            arr[4] = sc.nextInt();
            System.out.println("ARRAY AFTER SORTING THE ELEMENT BY SELECTION SORT:");
            Arrays.sort(arr);
            printArr(arr);
    }
}
