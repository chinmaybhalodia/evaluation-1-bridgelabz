public class Task {
    String name;
    User user;
    boolean isFinished;

    public Task(String name) {
        this.name = name;
        this.user = null;
        this.isFinished = false;
    }

    public void assignTask(User user) {
        if (this.isFinished || this.user != null) {
            System.out.println("Task cannot be assigned.\n");
            return;
        }
        this.user = user;
        user.tasks.put(this.name, this);
        System.out.println("Task assigned to " + user.name + " successfully.\n");
    }
}
