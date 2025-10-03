package in.arrays;

public class CountInversions {
    public static int countInversions(int[] arr){
        int count=0;
        for (int i=0;i<arr.length; i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int inversionMergeStep(int[] arr, int st, int en) {
        if (st < en) {
            int mid = (st + en) / 2;
            int leftInc = inversionMergeStep(arr, st, mid);
            int rightInc = inversionMergeStep(arr, mid + 1, en);
            int mergeInc = mergerSort(arr, st, mid, en);
            return leftInc + rightInc + mergeInc;
        }
        return 0;
    }

    private static int mergerSort(int[] arr, int st, int mid, int en) {
        int i = st;
        int j = mid + 1;
        int k = 0;
        int inCount = 0;
        int[] temp = new int[en - st + 1];

        while (i <= mid && j <= en) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inCount += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= en) {
            temp[k++] = arr[j++];
        }

        for (int idx = 0; idx < temp.length; idx++) {
            arr[st + idx] = temp[idx];
        }

        return inCount;
    }

    public static int inversionCount(int[] arr) {
        return inversionMergeStep(arr, 0, arr.length - 1);
    }
    public static void main(String[] args) {
//        int[] arr={2, 4, 1, 3, 5};
        int[] arr={2, 3, 4, 5, 6};
        int i = countInversions(arr);
        System.out.println(i);
        int i1 = inversionCount(arr);
        System.out.println(i1);
    }
}
