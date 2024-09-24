public class TaskFactory {
    public static Task createTask(String description) {
        return new Task(description);
    }
}
