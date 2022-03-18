package sortingalgos;

import java.util.*;

public class UserInput {

    public static int[] getUserInput() {
        List<Integer> userEntries = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers to sort, interrupted by non integer value : ");

        while (true && sc.hasNext()) {
            try {
                userEntries.add(sc.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("User entry interrupted by non integer entry");
                sc.close();
                break;
            }
        }
        int[] userInput = Arrays.stream(userEntries.toArray()).mapToInt(i -> (Integer) i).toArray();
        System.out.print("User input : ");
        for (int entry : userInput) {
            System.out.print(entry + " ");
        }
        return userInput;
    }

    public static void swap(int i, int j, int[] arr) {
        if (i==j)
        {
            return;
        }
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

}
