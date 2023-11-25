// Task Management System
// Create a task management system in Java. Design classes for tasks, users, and projects. Implement functionalities like creating tasks, assigning tasks to users, marking task completion, and generating reports.

public class TaskManagement {
    public static void main(String[] args) {

        // creating a new project
        Project project1 = new Project("Project1");

        // creating some tasks
        Task task1 = new Task("task1");
        Task task2 = new Task("task2");
        Task task3 = new Task("task3");
        Task task4 = new Task("task4");
        Task task5 = new Task("task5");

        // adding these tasks to the project
        project1.addTask(task1);
        project1.addTask(task2);
        project1.addTask(task3);
        project1.addTask(task4);
        project1.addTask(task5);

        // creating some users
        User user1 = new User("Chinmay");
        User user2 = new User("Rahul");

        // assigning tasks to users
        task1.assignTask(user1);
        task2.assignTask(user1);
        task3.assignTask(user2);
        task4.assignTask(user2);

        project1.printReport();

        user1.completeTask(task1.name);
        user2.completeTask(task3.name);
        task5.assignTask(user1);

        project1.printReport();
    }
}
