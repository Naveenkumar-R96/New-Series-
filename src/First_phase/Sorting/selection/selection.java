package First_phase.Sorting.selection;

public class selection {

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        selectionSort(arr);
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = 0;
            for (int j = 1; j < n - i; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap the largest found element with the last unsorted element
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
}
