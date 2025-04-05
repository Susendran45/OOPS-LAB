import java.io.FileReader;
import java.io.IOException;
public class SimpleFileRead {
public static void main(String[] args) {
try (FileReader reader = new FileReader("example.txt")) {
int character;
System.out.println("File content:");
while ((character = reader.read()) != -1) {
System.out.print((char) character);
}
} catch (IOException e) {
System.out.println("Error reading file: " + e.getMessage());
}
}
}