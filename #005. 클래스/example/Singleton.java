public class Singleton {
    public static void main(String[] args) {
        /*
        SingletonAPI obj1 = new Singleton();
        SingletonAPI obj2 = new Singleton(); 컴파일 에러
         */

        SingletonAPI obj1 = Singleton.getInstance();
        SingletonAPI obj2 = Singleton.getInstance();

        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체입니다.");
        } else {
            System.out.println("다른 Singleton 객체입니다.");
        }
    }
}
