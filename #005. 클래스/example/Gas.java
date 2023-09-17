public class Gas {
    public static void main(Stirng[] args) {
        GasAPI myCar = new Car();

        myCar.setGas(5); //GasAPI의 setGas() 메소드 호출

        boolean gasState = myCar.isLeftGas(); //GasAPI의 isLeftGas() 메소드 호출
        if(gasState) {
            System.out.println("출발합니다.");
            myCar.run(); //GasAPI의 run() 메소드 호출
        }

        if(myCar.isLeftGas()) { //GasAPI의 isLeftGas() 메소드 호출
            System.out.println("gas를 주입할 필요가 없습니다.");
        } else {
            System.out.println("gas를 주입하세요.");
        }
    }
}
