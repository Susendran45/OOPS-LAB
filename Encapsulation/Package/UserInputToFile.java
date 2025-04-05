import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class UserInputToFile {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your name: ");
String name = scanner.nextLine();
try {
FileWriter writer = new FileWriter("output.txt");
writer.write("Hello, " + name + "!");
writer.close();
System.out.println("Data saved to 'output.txt'!");
} catch (IOException e) {
System.out.println("An error occurred: " + e.getMessage());
}
scanner.close();
}
}