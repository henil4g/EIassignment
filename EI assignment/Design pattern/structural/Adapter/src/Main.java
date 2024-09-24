public class Main {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        ITarget adapter = new Adapter(adaptee);
        adapter.request();
    }
}
