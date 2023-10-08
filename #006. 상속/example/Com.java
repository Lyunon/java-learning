public class Com extends Cal {
    @Override //해당 라인부터 재정의
    double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        return Math.PI * r * r; 
    }
}
