package in.arrays;

public class Peakelement {
    public int peakElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean leftCheck = (i == 0 || arr[i] > arr[i - 1]);
            boolean rightCheck = (i == n - 1 || arr[i] > arr[i + 1]);
            if (leftCheck && rightCheck) {
                return i;
            }
        }
        return -1;
    }

    public int peakElement1(int[] arr, int n) {
        int low = 0, high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            // Check if mid is a peak
            boolean leftCheck = (mid == 0 || arr[mid] > arr[mid - 1]);
            boolean rightCheck = (mid == n - 1 || arr[mid] > arr[mid + 1]);

            if (leftCheck && rightCheck) {
                return mid; // found peak
            }
            // If right neighbor is greater → peak lies on the right
            else if (mid < n - 1 && arr[mid] < arr[mid + 1]) {
                low = mid + 1;
            }
            // Otherwise, peak lies on the left
            else {
                high = mid - 1;
            }
        }

        return -1; // should never reach here
    }
    public static void main(String[] args) {

    }
}
