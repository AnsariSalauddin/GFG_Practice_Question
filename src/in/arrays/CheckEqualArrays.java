package in.arrays;

import java.util.HashMap;

public class CheckEqualArrays {
    public static boolean checkEqualArray(int[] arr1, int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        HashMap<Integer,Integer> freq=new HashMap<>();
        for (int a:arr1){
            freq.put(a,freq.getOrDefault(a,0)+1);
        }
        for (int b:arr2){
            if(!freq.containsKey(b) || freq.get(b)==0){
                return false;
            }
            freq.put(b,freq.get(b)-1);
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
