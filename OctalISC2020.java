import java.util.Scanner;
public class OctalISC2020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of M");
        int m = sc.nextInt();
        System.out.println("Enter the value of N");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        // Taking input and converting to decimal
        for (int i = 0; i < m; i++) {
            System.out.println("Enter the elements of row " + (i + 1));
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        // Converting each row of octal to decimal and printing
        for (int i = 0; i < m; i++) {
            int decimalValue = 0;
            for (int j = n - 1, k = 0; j >= 0; j--, k++) {
                decimalValue += arr[i][j] * Math.pow(8, k);
            }
            System.out.println("Decimal value of row " + (i + 1) + ": " + decimalValue);
        }
        sc.close();
    }
}

