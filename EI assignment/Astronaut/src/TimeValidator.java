
import java.util.List;

public class TimeValidator {

    public static boolean isValidTimeFormat(String time) {
        return time.matches("^([01]?[0-9]|2[0-3]):[0-5][0-9]$");
    }

    public static boolean validateTask(Task newTask, List<Task> taskList) {
        if (!isValidTimeFormat(newTask.getStartTime()) || !isValidTimeFormat(newTask.getEndTime())) {
            System.out.println("Invalid time format.");
            return false;
        }

        for (Task existingTask : taskList) {
            if (tasksOverlap(newTask, existingTask)) {
                System.out.println("Task conflict with: " + existingTask.getDescription());
                return false;
            }
        }
        return true;
    }

    private static boolean tasksOverlap(Task newTask, Task existingTask) {
        return (newTask.getStartTime().compareTo(existingTask.getEndTime()) < 0 &&
                newTask.getEndTime().compareTo(existingTask.getStartTime()) > 0);
    }
}
