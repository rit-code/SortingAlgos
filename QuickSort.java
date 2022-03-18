package sortingalgos;

public class QuickSort {

    public static void main(String[] args) {
        int[] userInput = UserInput.getUserInput();
        quickSort(userInput, 0, userInput.length - 1);
        System.out.print("\n" + "Sorted output using quick sort : ");
        for (int entry : userInput) {
            System.out.print(entry + " ");
        }
    }

    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            // recursive call on the left of pivot
            quickSort(arr, low, pivotIndex - 1);

            // recursive call on the right of pivot
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                UserInput.swap(j, i, arr);
            }

        }
        UserInput.swap(i + 1, high, arr);
        return i + 1;
    }

}
