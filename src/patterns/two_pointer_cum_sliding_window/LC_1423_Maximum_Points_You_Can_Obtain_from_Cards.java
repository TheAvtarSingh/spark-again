package patterns.two_pointer_cum_sliding_window;

/* @AvtarSingh
*
taking k = 4
we can have multiple combies here -
0 left 4 right
1 left 3 right
2 left 2 right
3 left 1 right
4 left 0 right

we need to select the max of these right..
how to do is .. 1. take the combi 4 left , 0 right then on each iteration remove one from the left and one from the right and check for max if mex then store

to to achive
1. iterate on window size and store the left most sum
2. keep that leftSum as maxSum
3. now again iterate 0 to k times and keep on removing the left most and adding the right most
4. keep two sums - leftSum and rightSum and keep on adding to total and store as max
*
 */
public class LC_1423_Maximum_Points_You_Can_Obtain_from_Cards {

    public int maxScore(int[] cp, int k) {
        int leftScore = 0;
        int maxScore = 0;

        for(int i =0;i<k;i++){
            leftScore += cp[i];
        }
        maxScore = leftScore;
        int rightScore = 0;

        for(int i =0;i<k;i++){
            leftScore -= cp[k-1-i];
            rightScore += cp[cp.length-1-i];
            maxScore = Math.max(maxScore,leftScore+rightScore);
        }
        return maxScore;
    }

//    TC - [11,49,100,20,86,29,72]
//    K = 4
//    OP - 232
}
