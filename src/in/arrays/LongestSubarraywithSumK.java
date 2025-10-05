package in.arrays;

import java.util.HashMap;

public class LongestSubarraywithSumK {
    public static int longestSubarraywithSumk(int[] arr, int target){

        int maxlen=0;
        for (int i=0; i<arr.length; i++){
            for (int j=i; j<arr.length; j++){
                int sum=0;
                for (int k=i;k<=j; k++){
                    sum+=arr[k];
                }
                if(sum==target)maxlen=Math.max(maxlen,j-i+1);
            }
        }
        return maxlen;
    }
    public static int longestSubarraywithSumk1(int[] arr, int target){
        int maxLen=0;

        for (int i=0; i<arr.length; i++){
            int sum=0;
            for (int j=i; j<arr.length;j++){
                sum+=arr[j];
                if(sum==target)maxLen=Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }

    public static int longestSubarraywithSumk2(int[] arr, int target){
        int left=0;
        int right=0;
        int maxlen=0;
        int n=arr.length;
        int sum=arr[0];
        while (right<n){

            while (left<=right && sum>target){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
               maxlen= Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }

        }
        return maxlen;
    }
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> res=new HashMap<>();
        int maxlen=0;
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
            if(sum==k){
                maxlen=i+1;
            }
            int rem=sum-k;
            if(res.containsKey(rem)){
                maxlen=Math.max(maxlen, i-res.get(rem));
            }
            if(!res.containsKey(sum)){
                res.put(sum,i);
            }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        int[] a = {10 ,5, 2, 7, 1, -10};
        int k = 15;
        int i = longestSubarraywithSumk2(a, k);
        System.out.println(i);
    }
}
