public class VariableExchange{
        public static void main(String[] args) {
            int x = 3;
            int y = 5;
            System.out.println("x:" + x + ", y:" + y);
            
            int temp = x;
            //x의 값인 3을 temp에 저장
            x = y;
            //y의 값인 5를 x에 저장
            y = temp;
            //temp의 값인 3을 y에 저장
            System.out.println("x:" + x + ", y:" + y);
    }
}
