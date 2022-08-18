import java.io.FileOutputStream;
import java.io.OutputStream;

import javax.swing.text.html.StyleSheet;

public class OutputStreamDemo2 {
    public static void main(String[] args) {
        String data = "This is the example of outputStream in java";
        try {
            OutputStream out = new FileOutputStream("d:/java/FileForStream.txt");

            // converts the string into bytes
            byte[] dataBytes = data.getBytes();

            // write data to the output stream
            out.write(dataBytes);

            System.out.println("data is written to the file");

            // close the output stream
            out.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
