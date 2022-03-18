package sortingalgos;

public class InsertionSort {

    public static void main(String[] args) {
        int[] userInput = UserInput.getUserInput();

        // Insertion sort

        for (int i = 1; i < userInput.length; i++) {
            int key = userInput[i];
            int j = i - 1;
            while (j >= 0 && userInput[j] > key) {
                userInput[j + 1] = userInput[j];
                j--;
            }
            userInput[j + 1] = key;
        }
        System.out.print("\n" + "Sorted output using insertion sort : ");
        for (int entry : userInput) {
            System.out.print(entry + " ");
        }
    }
}
