import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEX {
    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("C:/temp/test1.db");

        byte a = 10;
        byte b = 20;
        byte c = 30;

        os.write(a);
        os.write(b);
        os.write(c);

        os.flush();
        os.close();
    }
}
