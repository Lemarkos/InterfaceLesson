public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Penguin penguin = new Penguin();
        Toad toad = new Toad();

        duck.swim();duck.fly();duck.run();
        penguin.swim();penguin.run();
        toad.swim();
    }
}
