package in.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

//Sort 0s, 1s and 2s
public class Sort_0s_1s_and_2s {
    public static void sort012(int[] arr) {
        // code here
        int n=arr.length;
        int c0=0;
        int c1=0;
        int c2=0;
        for(int num:arr){
            if(num==0){
                c0++;
            }else if(num==1){
                c1++;
            }else{
                c2++;
            }
        }
        int index=0;
        while(c0>0){
            arr[index++]=0;
            c0--;
        }
        while(c1>0){
            arr[index++]=1;
            c1--;
        }
        while(c2>0){
            arr[index++]=2;
            c2--;
        }
    }

    //Dutch National Flag

        public static void sort0123(int[] arr) {
            int low = 0, mid = 0, high = arr.length - 1;

            while (mid <= high) {
                if (arr[mid] == 0) {
                    // Swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                } else if (arr[mid] == 1) {
                    // Just move mid forward
                    mid++;
                } else { // arr[mid] == 2
                    // Swap arr[mid] and arr[high]
                    int temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                }
            }
        }
    public static void printArray(int[] arr){
        Arrays.stream(arr).forEach(System.out::print);

    }
    public static void main(String[] args) {
        int[] arr={0, 2, 1, 2,0};
        sort0123(arr);
        printArray(arr);

    }
}

