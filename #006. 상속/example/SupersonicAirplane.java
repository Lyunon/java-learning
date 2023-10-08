public class SupersonicAirplane {
    public static void main(String[] args) {
        Supersonic sa = new SupersonicAirplane();
        sa.takeoff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
