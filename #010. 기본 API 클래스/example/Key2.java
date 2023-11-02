public class Key2 {
    public int number;

    public Key(int number) {
        this.number = number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
