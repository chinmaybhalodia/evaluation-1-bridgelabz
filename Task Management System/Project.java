import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Project {
    String name;
    HashMap<String, Task> tasks;

    public Project(String name) {
        this.name = name;
        this.tasks = new HashMap<String, Task>();
    }

    public void addTask(Task task) {
        tasks.put(task.name, task);
        System.out.println("Task " + task.name + " created successfully.\n");
    }

    public ArrayList<String> getPendingTasks() {
        ArrayList<String> pending = new ArrayList<>();
        for (Map.Entry<String, Task> entry : this.tasks.entrySet()) {
            if (!entry.getValue().isFinished)
                pending.add(entry.getKey());
        }
        return pending;
    }

    public ArrayList<String> getUnassignedTasks() {
        ArrayList<String> unassigned = new ArrayList<>();
        for (Map.Entry<String, Task> entry : this.tasks.entrySet()) {
            if (entry.getValue().user == null)
                unassigned.add(entry.getKey());
        }
        return unassigned;
    }

    public void printReport() {
        ArrayList<String> pending = this.getPendingTasks();
        System.out.println("Following are the pending tasks in this project:");
        for (int i = 0; i < pending.size(); i++) {
            System.out.println(pending.get(i));
        }

        ArrayList<String> unassigned = this.getUnassignedTasks();
        System.out.println("\nFollowing are the unassigned tasks in this project:");
        for (int i = 0; i < unassigned.size(); i++) {
            System.out.println(unassigned.get(i));
        }

        System.out.println();
    }
}
