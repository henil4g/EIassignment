public class Main {
    public static void main(String[] args) {
        ScheduleManager manager = ScheduleManager.getInstance();
        manager.addTask("Complete assignment");

        ScheduleManager anotherManager = ScheduleManager.getInstance();
        anotherManager.addTask("Attend meeting");
    }
}
