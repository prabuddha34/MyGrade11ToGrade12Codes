import java.util.Scanner;

public class PrimeArray {
    Scanner sc = new Scanner(System.in);
    int m, n;
    int[][] arr;

    public static void main(String[] args) {
        PrimeArray primeArray = new PrimeArray();
        primeArray.getInput();
        primeArray.primeCheck();
    }

    void getInput() {
        System.out.println("Enter the value of M:");
        m = sc.nextInt();
        System.out.println("Enter the value of N:");
        n = sc.nextInt();
        arr = new int[m][n]; // Initialize the array with dimensions m x n
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true; // 2 is prime
        if (num % 2 == 0) return false; // even numbers > 2 are not prime

        // Check odd divisors up to the square root of num
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    void primeCheck() {
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isPrime(arr[i][j])) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

