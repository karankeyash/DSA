import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {

        int[] arr = {5, 4, 3, 2, 1};

        QuickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void QuickSort(int[] arr, int low, int hi) {

        if (low >= hi) {
            return;
        }

        int start = low;
        int end = hi;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while (start <= end) {

            while (arr[start] < pivot) {
                start++;
            }
            while (arr[end] > pivot) {
                end--;
            }

            if (start <= end) {

                Swapped(arr,start,end);
                start++;
                end--;

            }


        }
        QuickSort(arr,low,end);
        QuickSort(arr,start,hi);

    }

    private static void Swapped(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}