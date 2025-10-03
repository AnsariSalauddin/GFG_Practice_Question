package in.arrays;

public class findEquilibrium {
    public static int equilibriumIndex(int[] arr){

        int leftSum=0;
        int totalSum=0;
        for(int num:arr){
            totalSum+=num;
        }
        for (int i=0; i<arr.length;i++){
        long right=totalSum-leftSum-arr[i];
        if(right==leftSum){
            return i;
        }
        leftSum+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 0, 3};
        System.out.println(equilibriumIndex(arr1));

    }
}
