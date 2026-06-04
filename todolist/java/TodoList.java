import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    static ArrayList<String> todoListTitles = new ArrayList<>();
     static ArrayList<String> todoListDescriptions = new ArrayList<>();
    static ArrayList<Integer> todoListUniqueId = new ArrayList<>();
     static ArrayList<String> todoListCompletionStatus = new ArrayList<>();

    public static void main(String[] args) {

        Scanner inputCollector = new Scanner(System.in);
        int count = 0;

        while (true) {
            System.out.println("");
            System.out.println("Welcome to the TodoList!");
            System.out.println("1. Add Task");
            System.out.println("2. View Task");
            System.out.println("3. Complete Task");
            System.out.println("4. Delete Task");
            System.out.println("");
            System.out.print("Enter operation: ");
            
            int choice = inputCollector.nextInt();
            inputCollector.nextLine();

            if (choice == 1) {
                System.out.println("");
                while (true) {
                    System.out.print("Enter the title of the task: ");
                    String titleTask = inputCollector.nextLine();

                    System.out.print("Enter the description: ");
                    String descriptionTask = inputCollector.nextLine();

                    count++;
                    int idNumber = count;
                    
                    System.out.println("");
                    System.out.println(addTask(titleTask, descriptionTask, idNumber));
                    System.out.println("");

                    System.out.print("Do you want to enter another task (yes/no): ");
                    String answer = inputCollector.nextLine();
                    if (answer.equalsIgnoreCase("no")) {
                        break;
                    }
                    System.out.println("");
                }

            } else if (choice == 2) {
                System.out.println("");
                viewTask();

            } else if (choice == 3) {
                System.out.println("");
                String completeTag = "complete";

                System.out.print("Enter the unique id to mark completed task: ");
                int uniqueId = inputCollector.nextInt();

                System.out.println("");
                System.out.println(completeTask(uniqueId, completeTag));

            } else if (choice == 4) {
                System.out.println("");
                System.out.print("Enter the unique id to delete task: ");
                int uniqueId = inputCollector.nextInt();

                System.out.println("");
                System.out.println(removeTask(uniqueId));
            }
        }
    }

    public static String addTask(String titleTask, String descriptionTask, int idNumber) {
        todoListTitles.add(titleTask);
        todoListDescriptions.add(descriptionTask);
        todoListUniqueId.add(idNumber);
        todoListCompletionStatus.add("incomplete task");

        return "Task added successfully";
    }

    public static void viewTask() {
        if (todoListTitles.isEmpty()) {
            System.out.println("No tasks to display.");
            System.out.println("");
            return;
        }

        for (int index = 0; index < todoListTitles.size(); index++) {
            System.out.println("The unique id is: " + todoListUniqueId.get(index));
            System.out.println("The title is: " + todoListTitles.get(index));
            System.out.println("The description is: " + todoListDescriptions.get(index));
            System.out.println("The completion status: " + todoListCompletionStatus.get(index));
            System.out.println("");
        }
    }

    public static String completeTask(int idNumber, String completeTag) {
        int index = todoListUniqueId.indexOf(idNumber);

        if (index != -1) {
            todoListCompletionStatus.set(index, completeTag);
            return "Marked as complete!";
        }

        return "Not marked as complete";
    }

    public static String removeTask(int idNumber) {
        int index = todoListUniqueId.indexOf(idNumber);

        if (index != -1) {
            todoListTitles.remove(index);
            todoListUniqueId.remove(index);
            todoListDescriptions.remove(index);
            todoListCompletionStatus.remove(index);
            
            return "Deleted successfully";
        }

        return "Not removed";
    }
}
