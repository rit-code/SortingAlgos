package sortingalgos;

public class MergeSort {

    public static void main(String[] args) {
        int[] userInput = UserInput.getUserInput();
        mergeSort(userInput, 0, userInput.length - 1);
        System.out.print("\n" + "Sorted output using merge sort : ");
        for (int entry : userInput) {
            System.out.print(entry + " ");
        }
    }

    private static void mergeSort(int[] arr, int p, int r) {
        if (p >= r) {
            return;
        }
        int q = (p + r) / 2;
        mergeSort(arr, p, q);
        mergeSort(arr, q + 1, r);
        // merge function
        merge(arr, p, q, r);
    }

    private static void merge(int[] arr, int p, int q, int r) {
        int sbl1 = q - p + 1;
        int sbl2 = r - q;
        int[] L = new int[sbl1];
        int[] M = new int[sbl2];

        for (int i = 0; i < sbl1; i++) {
            L[i] = arr[p + i];
        }
        for (int j = 0; j < sbl2; j++) {
            M[j] = arr[q + 1 + j];
        }

        int i = 0, j = 0, k = p;

        // Until we reach either end of either L or M, pick larger among
        // elements L and M and place them in the correct position at A[p..r]
        while (i < sbl1 && j < sbl2) {
            if (L[i] <= M[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = M[j];
                j++;
            }
            k++;
        }

        // When we run out of elements in either L or M,
        // pick up the remaining elements and put in A[p..r]
        while (i < sbl1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < sbl2) {
            arr[k] = M[j];
            j++;
            k++;
        }
    }
}
