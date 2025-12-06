public class Task {
    private String title;
    private int priority;   // Ex: 1 = alta, 5 = baixa
    private String dueDate; // String simplificada para teste

    public Task(String title, int priority, String dueDate) {
        this.title = title;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public String getDueDate() {
        return dueDate;
    }

    @Override
    public String toString() {
        return title + " (Priority: " + priority + ", Due: " + dueDate + ")";
    }
}