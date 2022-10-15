package generics.comparing;

public class LambdaFunc {
    public static void main(String[] args) {
        Operation sum = (a, b) -> a + b;
        Operation divide = (a, b) -> a / b;

        LambdaFunc myCal = new LambdaFunc();
        System.out.println(myCal.operate(5, 3, sum));
        System.out.println(myCal.operate(5, 3, divide));
    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }
}

interface Operation {
    int operation(int a, int b);
}
