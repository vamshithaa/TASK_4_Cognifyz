import java.util.Scanner;

public class NumberPyramid {
    
    // Method to generate and print the pyramid pattern
    public static void generatePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print("  "); // Two spaces for better formatting
            }
            
            // Print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            
            // Print numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the number of rows for the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();
        
        // Generate the pyramid pattern
        generatePyramid(rows);
        
        // Close the scanner
        scanner.close();
    }
}