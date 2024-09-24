public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyA());
        context.performAction();  // Output: Executing Strategy A

        context.setStrategy(new ConcreteStrategyB());
        context.performAction();  // Output: Executing Strategy B
    }
}
