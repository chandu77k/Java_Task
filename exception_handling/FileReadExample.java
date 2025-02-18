package exception_handling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReadExample {
    // Method that reads a file using Scanner and declares throws IOException
    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        String fileName = "example.txt";  // Change this to the actual file path
        
        try {
            readFile(fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e);
            e.printStackTrace();
        }
    }
}
