public class Outter {
    //자바 7 이전
    public void method1(final int arg) {
        //arg = 100;
        //localVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    //자바 8 이후
    public void method2(int arg) {
        //arg = 100
        //localVariable = 100;
        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }
}
