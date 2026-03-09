import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileToArrayExample {
    public static void main(String[] args) {
        // Specify the file path
        Path path = Paths.get("/home/vpc/IdeaProjects/java-basics/java-basics/src/filename.txt");

        try {
            // Read all lines into a List<String>
            List<String> linesList = Files.readAllLines(path);

            // Print the contents of the list
            for (String s : linesList) {
                System.out.println(s);
            }

            // In Java, the primary difference is that a String[] (array) has a fixed size determined
            // at initialization, while a List<String> (specifically, an implementation like ArrayList<String>)
            // is a dynamic, resizable collection.

            // Convert the List<String> to a String[] array
            String[] linesArray = linesList.toArray(new String[0]);

            // Print the contents of the array (for verification)
            for (String line : linesArray) {
                System.out.println(line);
            }


        } catch (IOException e) {
            // Handle potential I/O errors (e.g., file not found, permission issues)
            e.printStackTrace();
        }
    }
}
