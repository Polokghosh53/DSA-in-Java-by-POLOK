package inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box1 = new Box(4.6, 7.9, 9.9);
//        Box box2 = new Box(box1);
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);

//        BoxWeight box3 = new BoxWeight();
//        System.out.println(box3.h + " " + box3.weight);

        Box box5 = new BoxWeight(2, 3, 4, 8);
        System.out.println(box5.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of the child class
        // this is why error
//        BoxWeight box6 = new Box(2, 3, 4);
//        System.out.println(box6);
    }
}
