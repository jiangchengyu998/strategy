package strategy;

public class MiniduckSimulator2 {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.display();
        duck.performFly();
        duck.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyWithWings());
        model.display();
        model.performFly();
    }
}
