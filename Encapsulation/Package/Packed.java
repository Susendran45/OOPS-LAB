import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import java.sql.*;
public class Packed {
public static void main(String[] args) {
Frame frame = new Frame("Combined Example");
frame.setLayout(new FlowLayout());
frame.setSize(400, 200);
Label label = new Label("Enter URL:");
TextField urlField = new TextField(20);
Button fetchButton = new Button("Fetch and Store");
TextArea resultArea = new TextArea(5, 30);
frame.add(label);
frame.add(urlField);
frame.add(fetchButton);
frame.add(resultArea);
fetchButton.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String url = urlField.getText();
try {
URLConnection conn = new URL(url).openConnection();
BufferedReader reader = new BufferedReader(
new InputStreamReader(conn.getInputStream()));                    
StringBuilder content = new StringBuilder();
String line;
while ((line = reader.readLine()) != null) {
content.append(line).append("\n");
}
reader.close();
Connection dbConn = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/testdb", "root", "password");                    PreparedStatement stmt = dbConn.prepareStatement(
"INSERT INTO web_content (url, content) VALUES (?, ?)");
stmt.setString(1, url);
stmt.setString(2, content.toString());
stmt.executeUpdate();                   
stmt.close();
dbConn.close();
resultArea.setText("Successfully fetched and stored content from:\n" + url);
} catch (Exception ex) {
resultArea.setText("Error: " + ex.getMessage());
}
}
});
frame.addWindowListener(new WindowAdapter() {
public void windowClosing(WindowEvent e) {
System.exit(0);
}
});
frame.setVisible(true);
}
}