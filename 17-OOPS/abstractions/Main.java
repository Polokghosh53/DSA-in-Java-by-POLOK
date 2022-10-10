package abstractions;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        Daughter daughter = new Daughter(28);
        daughter.career();

        // cannot create objects in abstract class, else override is required
        // Parent mom = new Parent();

    }
}
