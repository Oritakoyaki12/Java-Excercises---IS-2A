import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

class Task {
    private String taskName;
    private int priority;
    private Date dueDate;
    private String category;
    private boolean completed;
    private boolean urgent;

    public Task(String taskName, int priority, Date dueDate, String category, boolean urgent) {
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.category = category;
        this.completed = false;
        this.urgent = urgent;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markAsCompleted() {
        this.completed = true;
    }
    
    public boolean isUrgent() {
        return urgent;
    }

    public void setUrgent(boolean urgent) {
        this.urgent = urgent;
    }
}

class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void removeTask(Task task) {
        tasks.remove(task);
    }

    public void displayTasks() {
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    
    public void sortTasksByUrgencyAndPriority() {
        tasks.sort(Comparator.comparing(Task::isUrgent).reversed().thenComparingInt(Task::getPriority));
    }
    
    public void sortTasksByUrgencyAndDueDate() {
        tasks.sort(Comparator.comparing(Task::isUrgent).reversed().thenComparing(Task::getDueDate));
    }
    
    public List<Task> filterTasksByCategory(String category, boolean includeUrgent) {
        List<Task> filteredTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getCategory().equalsIgnoreCase(category) && (includeUrgent || !task.isUrgent())) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }
}
