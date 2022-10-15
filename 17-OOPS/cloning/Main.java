package cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human polok = new Human(34, "Polok Ghosh");
//        Human twin = new Human(polok);

        Human twin = (Human)polok.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(polok.arr));
    }
}
