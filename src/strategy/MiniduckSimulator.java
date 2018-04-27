package strategy;

public class MiniduckSimulator {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
