package generics.comparing;

public class Main {
    public static void main(String[] args) {
        Student polok = new Student(12, 89.76f);
        Student kunal = new Student(5, 99.52f);

        if (polok.compareTo(kunal) < 0) {
            System.out.println("Kunal has more marks");
        }
    }
}
