import java.util.Scanner;

public class MirrorMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input dimensions of the matrix
        System.out.print("Enter the number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int n = sc.nextInt();

        // Input elements of the matrix
        int[][] arr = new int[m][n];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Display original matrix
        System.out.println("The Original Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Create mirrored matrix
        int[][] mirr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mirr[i][j] = arr[i][n - 1 - j];
            }
        }

        // Display mirrored matrix
        System.out.println("The Mirror Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mirr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
