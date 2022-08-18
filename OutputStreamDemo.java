import java.io.*;

public class OutputStreamDemo {
    public static void main(String[] args)
            throws IOException {
        FileOutputStream file = new FileOutputStream("D:/java/FileForStream.txt");
        DataOutputStream data = new DataOutputStream(file);
        data.writeInt(65);
        data.close();
        System.out.println("Success...");
    }
}
