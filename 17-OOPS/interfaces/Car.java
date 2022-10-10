package interfaces;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void start() {
        System.out.println("I start like a normal Car");
    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal Car");
    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal Car");
    }
}
