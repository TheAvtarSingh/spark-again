package Array_Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class D_Remove_Duplicates_From_Sorted {
    public static int removeDuplicates(int[] arr) {
//        BF
       /*
       Set<Integer> set = new HashSet<Integer>();
        for (int j : arr) {
            set.add(j);
        }
       return set.size();
       */

        int uniqueElementIndex = 0;

        for(int i = 1;i<arr.length;i++){
            if(arr[i]!=arr[uniqueElementIndex]){
                uniqueElementIndex++;
                arr[uniqueElementIndex] = arr[i];
            }
        }
        return uniqueElementIndex+1;
    }
}
