import java.util.Scanner;

public class EvenNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = input.nextInt();

        System.out.print("Enter the ending number: ");
        int end = input.nextInt();

        int count = 0;
        int tempStart = start;
        while (tempStart <= end) {
            if (tempStart % 2 == 0) {
                count++;
            }
            tempStart++;
        }

        int[] evens = new int[count];
        int index = 0;

        int i = start;
        while (i <= end) {
            if (i % 2 == 0) {
                evens[index++] = i;
            }
            i++;
        }

        System.out.println("Even numbers in the given range:");
        int j = 0;
        if (evens.length > 0) {
            do {
                System.out.print(evens[j] + " ");
                j++;
            } while (j < evens.length);
        } else {
            System.out.println("No even numbers found in this range.");
        }
    }
}
