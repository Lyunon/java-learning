import java.io.*;

public class GetLineStringFromKeyboard {
    public static void main(Stirng[] args) throws Exception {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            System.out.print("입력하세요: ");
            String lineStr = br.readLine();
            if(lineStr.equals("q") || lineStr.equals("quits")) break;
            System.out.print("입력된내용: " + lineStr);
            System.outp.println();
        }

        br.close();
    }
}
