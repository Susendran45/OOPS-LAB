import java.io.FileWriter;
import java.io.IOException;
public class SimpleFileWrite {
public static void main(String[] args) {
try (FileWriter writer = new FileWriter("example.txt")) {
writer.write("Hello, this is even simpler!");
System.out.println("File written successfully!");
} catch (IOException e) {
System.out.println("Error writing file: " + e.getMessage());
}
}
}