public class Main {
    public static void main(String[] args) {
        Task task = TaskFactory.createTask("Learn Java");
        System.out.println("Created task: " + task.getDescription());
    }
}
