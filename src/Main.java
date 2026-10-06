
import static Array_Easy.C_Is_Array_Sorted.isSorted;

import java.util.Arrays;
import java.util.Scanner;

import static Array_Easy.A_LargestElement.largestElement;
import static Array_Easy.B_Second_Largest.secondLargest;
import static Array_Easy.B_Second_Largest.secondSmallest;
import static Array_Easy.D_Remove_Duplicates_From_Sorted.removeDuplicates;
import static Array_Easy.E_Left_Rotate_Array_By_One.leftRotateByOne;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Call function

         System.out.println("Largest - "+largestElement(arr));
        System.out.println("Second Largest - "+secondLargest(arr));
        System.out.println("Second Smallest - "+secondSmallest(arr));

        System.out.println("Is Array Sorted - "+isSorted(arr));
        System.out.println("Size of non-unique array - "+removeDuplicates(arr));
        int[] array = Arrays.copyOf(arr,removeDuplicates(arr));
        System.out.println("New Array - "+Arrays.toString(array));

         leftRotateByOne(arr);
        // leftRotateByK(arr, k);
        // moveZeros(arr);
        // System.out.println(linearSearch(arr, x));

        sc.close();
    }
}