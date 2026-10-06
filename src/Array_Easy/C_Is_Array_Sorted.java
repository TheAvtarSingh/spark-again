package Array_Easy;

public class C_Is_Array_Sorted {
    public static boolean isSorted(int[] arr) {
        return isAscendingOrder(arr) || isDescendingOrder(arr);
    }

    private static boolean isAscendingOrder(int[] arr) {
        boolean flag = true;

        for(int i = 1; i< arr.length; i++){
            if(arr[i]< arr[i-1]){
                flag = false;
            }
        }
        return flag;
    }

    private static boolean isDescendingOrder(int[] arr) {
        boolean flag = true;

        for(int i = 1; i< arr.length; i++){
            if(arr[i] > arr[i-1]){
                flag = false;
            }
        }
        return flag;
    }
}
