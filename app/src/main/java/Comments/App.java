/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package Comments;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {

   

    public static void main(String[] args) throws IOException {
        var filePath = "C:/Users/lenovo/OneDrive/Documents/NetBeansProjects/Comments/app/src/main/java/Comments/App.java";
       try {
       BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
// comment
        while ((line = br.readLine()) != null) {
            if (isComment(line)) {
                System.out.println("This is a Comment: " + line);
            } else {
                System.out.println("Not a comment: " + line);
            }
        }

        br.close();
    } catch (IOException e) {
          System.err.println("Error reading the file: +e.getMessage());
       }
    }

    private static boolean isComment(String line) {
        line = line.trim();
        return line.startsWith("//") || line.startsWith("/*");
    }
}
