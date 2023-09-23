public class CarStatic {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");
    }

    public static void main(String[] args) {
        CarStatic myCar = new Car();
        myCar.speed = 60;
        myCar.run();
    }
}
