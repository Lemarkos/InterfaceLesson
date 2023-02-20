public class Penguin implements CanSwim, CanRun{
    @Override
    public void run() {
        System.out.println("Penguin can run");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }

}
