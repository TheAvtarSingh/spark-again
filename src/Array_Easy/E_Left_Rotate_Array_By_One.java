package Array_Easy;

import java.util.Arrays;

public class E_Left_Rotate_Array_By_One {
    public static void leftRotateByOne(int[] arr) {
//        A , b -> b , A
        arr = reversedArray(arr);
System.out.println("After Rotating array by 1 - "+Arrays.toString(reversedArray(arr)));
    }

    private static int[] reversedArray(int[] arr){
        int i = 1;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
}
