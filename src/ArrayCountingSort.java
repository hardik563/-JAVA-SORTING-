import java.util.*;
public class ArrayCountingSort {
    public static void countingSort(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
                for(int i=0;i<arr.length;i++){
                    count[arr[i]]++;
                }
                int j=0;
                for(int i=0;i<count.length;i++){
                    while(count[i]>0){
                        arr[j]=i;
                        j++;
                        count[i]--;
                    }
                }
            }
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
        countingSort(arr);
        printArr(arr);
    }
}


