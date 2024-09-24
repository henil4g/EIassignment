public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        System.out.println(task.getDescription());

        Task highPriorityTask = new PriorityTaskDecorator(task);
        System.out.println(highPriorityTask.getDescription());
    }
}
