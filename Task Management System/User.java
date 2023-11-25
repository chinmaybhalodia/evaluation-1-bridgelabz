import java.util.HashMap;

public class User {
    String name;
    HashMap<String, Task> tasks;

    public User(String name) {
        this.name = name;
        this.tasks = new HashMap<String, Task>();
    }

    public void completeTask(String name) {
        if (this.tasks.containsKey(name)) {
            Task task = this.tasks.get(name);
            task.isFinished = true;
        } else {
            System.out.println("No such task assigned to this user.");
        }
    }
}
