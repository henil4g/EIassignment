

import java.util.ArrayList;
import java.util.List;


public class ScheduleManager {
    private static ScheduleManager instance;
    private List<Task> taskList;

    private ScheduleManager() {
        taskList = new ArrayList<>();
    }

    public static ScheduleManager getInstance() {
        if (instance == null) {
            instance = new ScheduleManager();
        }
        return instance;
    }

    public void addTask(Task task) {
        if (TimeValidator.validateTask(task, taskList)) {
            taskList.add(task);
            System.out.println("Task added: " + task.getDescription());
        } else {
            System.out.println("Task conflict detected! Task not added.");
        }
    }

    public void removeTask(String description) {
        taskList.removeIf(task -> task.getDescription().equalsIgnoreCase(description));
        System.out.println("Task removed: " + description);
    }

    public void viewTasks() {
        if (taskList.isEmpty()) {
            System.out.println("No tasks scheduled.");
        } else {
            for (Task task : taskList) {
                System.out.println(task);
            }
        }
    }
}
