package in.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TwoSum {
    //brute force approach- time complexity o(n*2)
    public static List<Integer> twoSum(int[] arr,int target){
        List<Integer> li=new ArrayList<>();
        for(int i=0; i<arr.length;i++){
            int sum=0;
            for (int j=i+1; j<arr.length; j++){
                sum=arr[i]+arr[j];
                if(sum==target){
                    li.add(arr[i]);
                    li.add(arr[j]);
                    break;
                }
            }
        }
        return li;
    }

    //better approach
    public static List<Integer> twoSum1(int[] arr,int target){
        Arrays.sort(arr);
        int sm=0;
        int lr=arr.length-1;
        List<Integer> li=new ArrayList<>();

        while (sm<lr){
            int sum=arr[sm]+arr[lr];
            if(sum==target){
                li.add(arr[sm]);
                li.add(arr[lr]);
            }else if(sum>target){
                lr--;
            }else {
                sm++;
            }
        }
        return li;
    }
    //optimal approach
    public static List<List<Integer>> twoSum3(int[] arr, int target){
        HashMap<Integer,Integer> mp=new HashMap<>();
        List<List<Integer>> li=new ArrayList<>();
        for (int i=0; i<arr.length;i++){
             int rem=target-arr[i];
             if(mp.get(rem)!=null){
                 List<Integer> list = Arrays.asList(rem,arr[i]);
                 li.add(list);
             }else {
                 mp.put(arr[i],i);
             }
        }
        return li;
    }
    public static void main(String[] args) {
    int[] arr={5,2,11,7,15};
        List<Integer> list = twoSum(arr, 9);
        System.out.println(list.toString());
        List<List<Integer>> lists = twoSum3(arr, 9);
        System.out.println(lists.toString());
    }
}
