public class CarOverloading {
    public static void main(String[] args) {
        CarOverloadingAPI car1 = new Car();
        System.out.println("car1.company : " + car1.company);
        System.out.println();

        CarOverloadingAPI car2 = new Car();
        System.out.println("car2.company : " + car2.company);
        System.out.println("car2.model : " + car2.model);
        System.out.println();

        CarOverloadingAPI car3 = new Car();
        System.out.println("car3.company : " + car3.company);
        System.out.println("car3.model : " + car3.model);
        System.out.println("car3.color : " + car3.color);
        System.out.println();

        CarOverloadingAPI car4 = new Car();
        System.out.println("car4.company : " + car4.company);
        System.out.println("car4.model : " + car4.model);
        System.out.println("car4.color : " + car4.color);
        System.out.println("car4.maxSpeed : " + car4.maxSpeed);
    }
}
