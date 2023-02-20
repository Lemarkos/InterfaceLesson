public class Duck implements CanSwim, CanRun, CanFly{
    @Override
    public void fly() {
        System.out.println("Duck can fly");
    }

    @Override
    public void run() {
        System.out.println("Duck can run");
    }

    @Override
    public void swim() {
        System.out.println("Duck can swim");
    }
}
