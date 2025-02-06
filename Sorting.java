public class Sorting {
    // Selection Sort : select Min and Swap
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
    }

    // Bubble Sort : push the max element to the end of the array by adjacent swaps.
    public static void bubbleSort(int[] nums) {
        int didSwap = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    // Swap
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    didSwap = 1;
                }
            }
            if (didSwap == 0) {
                break;
            }
        }
    }

    // Insertion sort tip : get element and place it in its correct position.
    public static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int j = i;
            while (j > 0 && nums[j] < nums[j - 1]) {
                int temp = nums[j];
                nums[j] = nums[j - 1];
                nums[j - 1] = temp;
                j--;
            }
        }
    }

    public static void mergeSort(int[] nums, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        mergeSort(nums, low, mid);
        mergeSort(nums, mid + 1, high);
        merge(nums, low, mid, high);
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high + 1];
        int i = 0;
        int leftPointer = low;
        int rightPointer = mid + 1;
        while (leftPointer <= mid && rightPointer <= high) {
            if (nums[leftPointer] <= nums[rightPointer]) {
                temp[i++] = nums[leftPointer++];
            } else {
                temp[i++] = nums[rightPointer++];
            }
        }

        while (leftPointer <= mid) {
            temp[i++] = nums[leftPointer++];
        }
        while (rightPointer <= high) {
            temp[i++] = nums[rightPointer++];
        }

        for (int j = low; j <= high; j++) {
            nums[j] = temp[j - low];
        }
    }
}