import java.util.Scanner;
import java.util.Arrays;
import java.lang.*;

class Task {
    private String title;
    private String assignedTo;
    private int timeTocomplete;
    private boolean important;
    private boolean urgency;
    private String status;
    String importance;
    String urgent;
    boolean isExpection = false;
    // public void
    // private String[] my_tokens;
    Task(String title, String assignedTo, int timeTocomplete, boolean important, boolean urgent, String status) {
        this.title = title;
        this.assignedTo = assignedTo;
        this.timeTocomplete = timeTocomplete;
        this.important = important;
        this.urgency = urgency;
        this.status = status;
        // System.out.println("prininf todo |"+status+"|");
        try {
            if (title.length() <= 0) {
                // isExpection = true;

                throw new Exception("Title not provided");
                // break;
            }
            if (timeTocomplete <= 0) {
                // isExpection = true;

                throw new Exception("Invalid timeToComplete " + timeTocomplete);

            }
            if (status.equals("todo") || status.equals("done")) {
                // isExpection = true;
            } else {
                throw new Exception("Invalid status " + status);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    int gettimeTocomplete(){
        return timeTocomplete;
    }
    String getTaskTitle() {
        return title;
    }

    String getAssignedTo() {
        return assignedTo;
    }

    boolean getUrgent() {
        return urgency;
    }
    boolean getImp() {
        return important;
    }

    String getStatus() {
        return status;
    }
    public String toString() {
        if (important) {
            importance = "Important";
        } else {
            importance = "Not Important";
        }
        if (urgency) {
            urgent = "Urgent";
        } else {
            urgent = "Not Urgent";
        }
        return title + ", " + assignedTo + ", " + timeTocomplete + ", " + important + ", " + urgent + ", " + status;
    }
}
/**
  * write your code below this comment
  */


class Todoist {
    Task[] task_arr;
    int size;
    int max_size = 100;
    Todoist() {
        task_arr = new Task[max_size];
        size = 0;
    }
    public void addTask(Task item) {
        task_arr[size] = item;
        size++;
    }
    int totalTime4Completion() {
        int count = 0;
        for (int i = 0; i < size; i++ ) {
            if (task_arr[i].getStatus().equals("todo")) {
                count += task_arr[i].gettimeTocomplete();
            }
        }
        return count;
    }
    String[] getNextTask(String task, int a) {
        String next_task[];
        next_task = new String[10];
        return next_task;
    }
    String getNextTask(String name) {
        String next_task = "";
        boolean ifcheck = false;
        for (int i = 0; i < size; i++ ) {
            if (task_arr[i].getAssignedTo().equals(name) && (task_arr[i].getStatus().equals("todo"))  && (task_arr[i].getImp()) && !(task_arr[i].getUrgent())) {
                next_task = "" + task_arr[i];
                ifcheck = true;
                break;
            }
        }
        if (!ifcheck) {
            next_task = "null";

        }
        return next_task;
    }
    public String toString() {
        String ans = "", t;
        for (int i = 0; i < size ; i++ ) {
            t = "" + task_arr[i] + "\n";
            ans += t;
    }
    return ans;
}
class TitleException extends Exception {
    public String toString() {
        return "Title not provided";
    }

}
/**
 * Class for todoist main.
 */
public class TodoistMain {

    /**
     * Starts a test.
     */
    public void startTest() {
        Todoist todo = new Todoist();
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            String[] tokens = s.nextLine().split(",");
            switch (tokens[0]) {
            case "task":
                testTask(tokens);
                break;
            case "add-task":
                testAddTask(todo, tokens);
                break;
            case "print-todoist":
                System.out.println(todo);
                break;
            case "get-next":
                System.out.println(todo.getNextTask(tokens[1]));
                break;
            case "get-next-n":
                int n = Integer.parseInt(tokens[2]);
                // Task[] tasks = todo.getNextTask(tokens[1], n);
                // System.out.println(Arrays.deepToString(tasks));
                break;
            case "total-time":
                System.out.println(todo.totalTime4Completion());
                break;
            default:
                break;
            }
        }
    }

    /**
     * method to test add task.
     *
     * @param      todo    The todo
     * @param      tokens  The tokens
     */
    public void testAddTask(final Todoist todo, final String[] tokens) {
        try {
            todo.addTask(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * method to test the creation of task object.
     *
     * @param      tokens  The tokens
     */
    public void testTask(final String[] tokens) {
        try {
            // if (createTask(tokens) != null) {
            // System.out.println("its not null");
            System.out.println(createTask(tokens));
            // }
        } catch (Exception e) {
            System.out.println("ss" + e.getMessage());
        }
    }

    /**
     * Creates a task object.
     *
     * @param      tokens     The tokens
     *
     * @return     Task object
     *
     * @throws     Exception  if task inputs are invalid
     */
    public Task createTask(final String[] tokens) throws Exception {
        String title = tokens[1];
        String assignedTo = tokens[2];
        int timeToComplete = Integer.parseInt(tokens[3]);
        boolean important = tokens[4].equals("y");
        boolean urgent = tokens[5].equals("y");
        String status = tokens[6];
        try {
            Task task_item = new Task(
                title, assignedTo, timeToComplete, important, urgent, status);
            return task_item;
        } catch ( Exception e) {
            // System.out.println(e);
            throw new Exception("Title not provided");


        }

        // System.out.println("important" + important + "\nurgent" + urgent );
        // return task_item;
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public void main(final String[] args) {
        startTest();
    }
}
}
