public class CalStatic {
    public static void main(String[] args) {
        double result1 = 10 * 10 * CalStaticAPI.pi;
        int result2 = CalStaticAPI.plus(10, 5);
        int result3 = CalStaticAPI.minus(10, 5);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
        System.out.println("result3 : " + result3);
    }
}
