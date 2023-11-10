public class PrintThread3 extends Thread {
    public void run() {
        while(true) {
            System.out.println("실행 중");
            if(Thread.interrupted()) {
                breakl
            }
        }

        System.out.println("자원 정리");
        System.out.println("실행 종료");
    }
}
