public class Outter2 {
    String field = "Outter-field";
    void method() {
        System.out.println("Outter-field");
    }

    class Nested {
        String field = "Nested-field";
        void method() {
            System.out.println("Nested-field");
        }
        void print() {
            System.out.println(this.field);
            this.method();
            System.out.println(Outter2.this.field)
            Outter2.this.method();
        }
    }
}
