package Array_Easy;

public class A_LargestElement {
    public static int largestElement(int[] arr) {
int num = arr[0];
for(int n : arr){
    if(n > num) num = n;
}
return num;
    }
}
