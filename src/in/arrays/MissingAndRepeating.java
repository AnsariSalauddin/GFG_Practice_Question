package in.arrays;

public class MissingAndRepeating {
    public static int[] missingAndRepeating(int[] arr){
        int[] count=new int[arr.length+1];
        int repeating=0;
        int missing=0;
        for (int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        for (int j=0; j<count.length;j++){
            if(count[j]==2){
                repeating=j;
            }else if(count[j]==0){
                missing=j;
            }
        }
        return new int[]{repeating,missing};
    }
    public static void main(String[] args) {
        int[] temp={2, 2};
        int[] ints = missingAndRepeating(temp);
        for (int num:ints){
            System.out.println(num);
        }
    }
}
