import java.util.Scanner;

public class  prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of M (rows):");
        int m = sc.nextInt();
        System.out.println("Enter the value of N (columns):");
        int n = sc.nextInt();
        
        // Create a 2D array to store prime numbers
        int[][] primeArray = new int[m][n];
        
        int primeCount = 0; // Counter for prime numbers found
        int num = 2; // Start checking for primes from 2
        
        while (primeCount < m * n) {
            if (isPrime(num)) {
                int row = primeCount / n;
                int col = primeCount % n;
                primeArray[row][col] = num;
                primeCount++;
            }
            num++;
        }
        
        // Print the pime array
        System.out.println("Prime numbers in a " + m + "x" + n + " array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(primeArray[i][j] + "\t");
            }
            System.out.println();
        }
        
        sc.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}