import java.io.*;

public class NonBufferVSBufferEx {
    public static void main(String[] args) throws Exception {
        String originalFilePath1 =
            NonBufferVSBufferEx.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "C:/Temp/targetFile1.jpg";
        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFile1);

        String originalFilePath2 =
            NonBufferVSBufferEx.class.getResource("originalFile2.jpg").getPath();
        String targetFilePath2 = "C:/Temp/targetFile2.jpg";
        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFile2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼를 사용하지 않았을 때:\t" + nonBufferTime + "ns");

        long bufferTime = cpoy(bis, bos);
        System.out.println("버퍼를 사용했을 때:\t\t" + bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    static int data -1;
    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();
        while(true) {
            data = is.read();
            if(data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end-start);
    }
}
