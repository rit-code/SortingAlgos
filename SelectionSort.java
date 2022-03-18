package sortingalgos;

public class SelectionSort {

    public static void main(String[] args) {
        int[] userInput = UserInput.getUserInput();
        int inputSize = userInput.length;

        // Insertion Sort

        for (int i = 0; i < inputSize - 1; i++) {
            int smallestNumIndex = i;
            for (int j = i + 1; j < inputSize; j++) {

                if (userInput[j] < userInput[smallestNumIndex]) {
                    smallestNumIndex = j;
                }
            }
            if (i != smallestNumIndex) {
                UserInput.swap(i, smallestNumIndex, userInput);
            }
        }
        System.out.print("\n" + "Sorted output using selection sort : ");
        for (int l : userInput) {
            System.out.print(l + " ");
        }
    }
}
