import java.text.*;
import java.util.*;

public class DateEx {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = noew.toString();
        System.out.println(strNow1);

        SimpleDateFormat sdf =
            new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
            String strNow2 = sdf.format(now);
            System.out.println(strNow2);
    }
}
