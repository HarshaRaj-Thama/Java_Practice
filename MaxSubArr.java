//5 Given an integer array nums, find the subarray with the largest sum, and return its sum. Input:
//nums = [-2,1,-3,4,-1,2,1,-5,4]Output: 6Explanation: The subarray [4,-1,2,1] has the largest sum 6.
//Input: nums = [5,4,-1,7,8] Output: 23 Explanation: The subarray [5,4,-1,7,8] has the largest sum
//        23. using java 8
public class MaxSubArr {
    public static void main(String[] args) {
        int arr[] = {5,4,-1,7,8};

        int currentsum = arr[0];
        int maxsum = arr[0];

        for (int i = 1; i < arr.length ; i++){
            currentsum = Math.max(arr[i], currentsum + arr[i]);
            maxsum = Math.max(maxsum,currentsum);
        }
        System.out.println(maxsum);


    }
}
