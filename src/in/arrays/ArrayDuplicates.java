package in.arrays;

import java.util.ArrayList;

public class ArrayDuplicates {

    public ArrayList<Integer> findDuplicates(int[] arr) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                // Already visited → Duplicate found
                result.add(index + 1);
            } else {
                // Mark as visited
                arr[index] = -arr[index];
            }
        }

        return result;
    }
}
