import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class BufferedFileWrite {
public static void main(String[] args) {
try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
writer.write("Using BufferedWriter is more efficient");
writer.newLine();
writer.write("Especially when writing multiple lines");
writer.newLine();
writer.write("Or large amounts of data");
System.out.println("File written successfully!");
} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
}
}
}