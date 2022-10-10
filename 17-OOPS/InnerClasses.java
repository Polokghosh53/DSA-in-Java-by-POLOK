public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Polok");
        Test b = new Test("Kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}
