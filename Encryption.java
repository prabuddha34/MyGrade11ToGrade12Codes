import java.util.Scanner;

public class Encryption {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String !");
        String str = sc.nextLine();
        sc.close();
        
        int counter = 0;
        int ch[] = new int[26];
        for (int i = 0; i < 26; i++) {
            ch[i] = i + 1;
        }
        
        int potential = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            // Check if character is an uppercase letter
            if (character >= 'A' && character <= 'Z') {
                // Calculate the position value (A=1, B=2, ..., Z=26)
                potential += (character - 'A' + 1);
            }
        }
        
        System.out.println("Potential: " + potential);
    }
}
