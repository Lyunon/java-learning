public class Computer {
    public static void main(String[] args) {
        int r = 10;

        Cal calculator = new Calculator();
        System.out.println("원면적 : " + calculator.areaCircle(r));
        System.out.println();

        Com computer = new Computer();
        System.out.println("원면적 : " + computer.areaCircle(r));
    }
}
