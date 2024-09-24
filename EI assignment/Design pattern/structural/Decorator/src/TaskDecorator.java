public class TaskDecorator extends Task {
    protected Task task;

    public TaskDecorator(Task task) {
        this.task = task;
    }

    @Override
    public String getDescription() {
        return task.getDescription();
    }
}
