package in.arrays;

import java.util.PriorityQueue;

public class KthSmallestAndLargestElement {
    public static int smallestKthElement(int[] arr, int k){
        PriorityQueue<Integer> p=new PriorityQueue<>((a,b)->b-a);
        for (int num:arr){
            p.offer(num);
            if (p.size()>k){
                p.poll();
            }
        }
        System.out.println(p);
        return p.peek();
    }
    public static int largestKthElement(int[] arr, int k){
        PriorityQueue<Integer> p=new PriorityQueue<>();
        for (int num:arr){
            p.offer(num);
            if (p.size()>k){
                p.poll();
            }
        }
        System.out.println(p);
        return p.peek();
    }

    //using quick sort
    public static void main(String[] args) {
        int[] arr1 = {7, 10, 4, 3, 20, 15};
        System.out.println(largestKthElement(arr1,2));
    }
}
