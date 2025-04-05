import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class BufferedFileRead {
public static void main(String[] args) {
try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
String line;
System.out.println("File content:");
while ((line = reader.readLine()) != null) {
System.out.println(line);
}
} catch (IOException e) {
System.out.println("Error reading file: " + e.getMessage());
}
}
}