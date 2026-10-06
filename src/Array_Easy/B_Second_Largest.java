package Array_Easy;

public class B_Second_Largest {
    public static int secondLargest(int[] arr) {
        int firstLargest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        if(arr.length < 2)return -1;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if( arr[i] < firstLargest && arr[i] > secondLargest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int secondSmallest(int[] arr) {
        int firstSmallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < firstSmallest){
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            }else if(arr[i] > firstSmallest && arr[i] < secondSmallest){
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }
}
