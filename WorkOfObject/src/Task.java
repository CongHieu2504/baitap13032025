import java.util.ArrayList;
import java.util.List;

public class Task {
    private String taskName;
    private String status;
    private List<TaskObserver> observers;

    public Task(String taskName, String status) {
        this.taskName = taskName;
        this.status = status;
        this.observers = new ArrayList<>();
    }

    public void addObserver(TaskObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TaskObserver observer) {
        observers.remove(observer);
    }

    public void setStatus(String status) {
        if (!this.status.equals(status)) {
            this.status = status;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(this.taskName, this.status);
        }
    }
}