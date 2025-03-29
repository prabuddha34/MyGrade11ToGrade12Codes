import java.util.Scanner;
public class Lol {
    String x, y, z;
    int n;

    // Constructor to initialize x, y, z and n
    Lol() {
        x = "a";
        y = "b";
        z = "ba";
        n = 0;
    }

    // Method to accept input from user
    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms (n):");
        n = sc.nextInt();
        sc.close();  // Close scanner after input is taken
    }

    // Method to generate Fibonacci-like sequence of strings
    void generate() {
        System.out.println("Fibonacci-like sequence of strings:");
        for (int i = 1; i <= n; i++) {
            z = x + y;
            System.out.print(z + " ");
            x = y;
            y = z;
        }
    }

    // Main method as the entry point of the program
    public static void main(String[] args) {
        Lol ob = new Lol();
        ob.accept();  // Call accept to get user input
        ob.generate();  // Generate and print Fibonacci-like sequence
    }
}
