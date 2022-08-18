import java.io.FileOutputStream;

public class FileoutputStreamDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("d:/java/FileForStream.txt");
            fout.write(65);

            // String s = "Ram and Bharat";
            // byte b[] = s.getBytes();
            // fout.write(b);
            // fout.close();

            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
