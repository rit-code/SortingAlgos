package sortingalgos;

public class HeapSort {

    public static void main(String[] args) {
        int[] userInput = UserInput.getUserInput();
        heapSort(userInput);
        System.out.print("\n" + "Sorted output using heap sort : ");
        for (int entry : userInput) {
            System.out.print(entry + " ");
        }
    }

    private static void heapSort(int[] userInput) {
        int n = userInput.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(userInput, n, i);
        }

        // Heap sort
        for (int i = n - 1; i >= 0; i--) {
            int temp = userInput[0];
            userInput[0] = userInput[i];
            userInput[i] = temp;

            // Heapify root element
            heapify(userInput, i, 0);
        }
    }

    private static void heapify(int[] userInput, int n, int i) {

        // Find largest among root, left child and right child
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && userInput[l] > userInput[largest])
            largest = l;

        if (r < n && userInput[r] > userInput[largest])
            largest = r;

        // Swap and continue heapifying if root is not largest
        if (largest != i) {
            int swap = userInput[i];
            userInput[i] = userInput[largest];
            userInput[largest] = swap;

            heapify(userInput, n, largest);
        }
    }
}
