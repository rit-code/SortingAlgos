package sortingalgos;

public class BubbleSort {

    public static void main(String[] args) {
        int[] userInput = UserInput.getUserInput();
        int arrLength = userInput.length;
        // Bubble Sort
        for (int i = 0; i < arrLength - 1; i++) {
            for (int j = 0; j < arrLength - i - 1; j++) {
                if (userInput[j] > userInput[j+1]) {
                    UserInput.swap(j, j+1, userInput);
                }
            }
        }

        System.out.print("\n" + "Sorted output using bubble sort : ");
        for (int entry : userInput) {
            System.out.print(entry + " ");
        }

    }
}
