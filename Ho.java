import java.util.Scanner;
public class Ho {
    Scanner sc = new Scanner(System.in);
    int m, n;
    int[][] arr;

    void input() {
        System.out.println("Enter the value of M:");
        m = sc.nextInt();
        System.out.println("Enter the value of N:");
        n = sc.nextInt();
        arr = new int[m][n]; // Initialize the array after obtaining m and n
    }

    void array() {
        System.out.println("Enter the elements:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void displayOriginalArray() {
        System.out.println("The Original Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    void process() {
        if (m < 2 || n < 2) {
            System.out.println("Cannot process innermost elements. Array dimensions must be at least 2x2.");
            return;
        }

        System.out.println("Innermost Elements:");
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Ho ob = new Ho();
        ob.input();
        ob.array();
        ob.displayOriginalArray();
        ob.process();
    }
}
