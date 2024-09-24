public class PriorityTaskDecorator extends TaskDecorator {
    public PriorityTaskDecorator(Task task) {
        super(task);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " [High Priority]";
    }
}
