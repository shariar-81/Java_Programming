import java.util.Scanner;

public class PrimeNumbersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }

        int[] primes = new int[count];
        int index = 0;

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }

        System.out.println("Prime numbers in the given range:");
        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}

