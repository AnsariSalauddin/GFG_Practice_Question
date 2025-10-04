package in.arrays;

import java.util.HashMap;

public class LargestSubarrayWithSum {
    public static int largestSubarrayWithSum(int[] arr){
        HashMap<Integer,Integer> preSumAndIndex=new HashMap<>();
        int maxLength=0;
        int sum=0;
        for (int i=0; i<arr.length; i++){
             sum+=arr[i];
             if(sum==0){
                maxLength=i+1;
             }else {
                 if(preSumAndIndex.get(sum)!=null){
                     maxLength=Math.max(maxLength,i-preSumAndIndex.get(sum));
                 }else {
                     preSumAndIndex.put(sum, i);
                 }
             }
        }
        return maxLength;
    }
    public static void main(String[] args) {
    int[] arr={15,-2,2,-8,1,7,10,23};
        int max= largestSubarrayWithSum(arr);
        System.out.println(max);
    }
}
