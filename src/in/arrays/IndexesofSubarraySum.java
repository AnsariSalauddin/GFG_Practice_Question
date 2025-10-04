package in.arrays;

import java.util.ArrayList;

public class IndexesofSubarraySum {
    public static ArrayList<Integer> subarraySum(int[] arr, int target){
        ArrayList<Integer> res=new ArrayList<>();
        int left=0;
        int right=0;
        int n=arr.length;
        int sum=0;
        while (right<n){
            sum+=arr[right];
            while (sum>target && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==target){
                res.add(left+1);
                res.add(right+1);
                return res;
            }
            right++;
        }
        res.add(-1);
        return res;
    }
    public static void main(String[] args) {

    }
}
