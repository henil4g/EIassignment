public class ScheduleManager {
    private static ScheduleManager instance;

    private ScheduleManager() {}

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(String task) {
        System.out.println("Task added: " + task);
    }
}
