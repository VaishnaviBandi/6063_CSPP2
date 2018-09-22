import java.util.Scanner;
import java.util.Arrays;
// import java.lang.*;

/**
  * write your code below this comment
  */
/**
 * Class for task.
 */
class Task {
    /**
     * { String title }.
     */
    private String title;
    /**
     * { String assignedTo }.
     */
    private String assignedTo;
    /**
     * { int timeTocomplete }.
     */
    private int timeTocomplete;
    /**
     * { boolean imp }.
     */
    private boolean imp;
    /**
     * { boolean urgent }.
     */
    private boolean urgent;
    /**
     * { String status }.
     */
    private String status;
    /**
     * { String importance }.
     */
    private String importance;
    /**
     * { String new_urgent }.
     */
    private String new_urgent;
    /**
     * { var_description }.
     */
    private boolean isExpection = false;
    // public void
    // private String[] my_tokens;

/**
 * Constructs the object.
 *
 * @param      title1           The title 1
 * @param      assignedTo1      The assigned to 1
 * @param      timeTocomplete1  The time tocomplete 1
 * @param      imp1             The imp 1
 * @param      urgent1          The urgent 1
 * @param      status1          The status 1
 *
 * @throws TitleException
 */
    Task(final String title1, final String assignedTo1,
         final int timeTocomplete1, final boolean imp1,
         final boolean urgent1,
         final String status1) throws TitleException {
        this.title = title1;
        this.assignedTo = assignedTo1;
        this.timeTocomplete = timeTocomplete1;
        this.imp = imp1;
        this.urgent =   urgent1;
        this.status = status1;
        try {
            if (title.length() <= 0) {
                throw new Exception("Title not provided");
            }
            if (timeTocomplete <= 0) {
                throw new Exception("Invalid timeToComplete " + timeTocomplete);
            }
            if (status.equals("todo") || status.equals("done")) {
            } else {
                throw new Exception("Invalid status " + status);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    int gettimeTocomplete() {
        return timeTocomplete;
    }
    /**
     * Gets the task title.
     *
     * @return     The task title.
     */
    String getTaskTitle() {
        return title;
    }
    /**
     * Gets the assigned to.
     *
     * @return     The assigned to.
     */
    String getAssignedTo() {
        return assignedTo;
    }

    /**
     * Gets the urgent.
     *
     * @return     The urgent.
     */
    boolean getUrgent() {
        return urgent;
    }

    /**
     * Gets the imp.
     *
     * @return     The imp.
     */
    boolean getImp() {
        return imp;
    }
    /**
     *
     * Gets the status.
     *
     * @return     The status.
     */
    String getStatus() {
        return status;
    }

    /**
     *
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (imp) {
            importance = "Important";
        } else {
            importance = "Not Important";
        }
        if (urgent) {
            // System.out.println("set to urgernt");
            new_urgent = "Urgent";
        } else {
            // System.out.println("set to not urgernt");
            new_urgent = "Not Urgent";
        }
        return title + ", " + assignedTo + ", " + timeTocomplete
               + ", " + importance + ", " + new_urgent + ", " + status;

}
/**
 * Exception for signaling title errors.
 */
class TitleException extends Exception {
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        return "Title not provided";
    }

}

class Todoist {
    /**
     * { todo_arr }.
     */
    private Task[] todo_arr;
    /**
     * { size }.
     */
    private int size;
    /**
     * { max_size }.
     */
    final private int max_size = 100;
    /**
     * Constructs the object.
     */
    Todoist() {
        todo_arr = new Task[max_size];
        size = 0;
    }
    /**
     * Adds a task.
     *
     * @param      item  The item
     */
    public void addTask(Task item) {
        todo_arr[size] = item;
        size++;
    }
    /**
     * { function_description }.
     *
     * @return     { description_of_the_return_value }
     */
    int totalTime4Completion() {
        int tot = 0;
        for (int i = 0; i < size; i++ ) {
            if (todo_arr[i].getStatus().equals("todo")) {
                tot += todo_arr[i].gettimeTocomplete();
            }
        }
        return tot;
    }
    /**
     * Gets the next task.
     *
     * @param      name   The name
     * @param      count  The count
     *
     * @return     The next task.
     */
    String[] getNextTask(final String name, final int count) {
        String[] next_task;
        String new_task = "";
        // new_size=0
        int new_count = 0;
        final int hun = 100;
        next_task = new String[hun];
        for (int i = 0; i < size; i++ ) {
            if (todo_arr[i].getAssignedTo().equals(name) && (todo_arr[i].getStatus().equals("todo"))  && (todo_arr[i].getImp()) && !(todo_arr[i].getUrgent())) {
                new_task = "" + todo_arr[i];
                next_task[new_count] = new_task;
                new_count++;
                if (new_count == count) {
                    // ifcheck = true;
                    break;

                }
            }
        }
        String[] ans_task;
        ans_task = new String[count];
        for (int i = 0; i < new_count; i++) {
            ans_task[i] = next_task[i];
        }
        return ans_task;
    }
    /**
     * Gets the next task.
     *
     * @param      name  The name
     *
     * @return     The next task.
     */
    String getNextTask(final String name) {
        String next_task = "";
        boolean ifcheck = false;
        for (int i = 0; i < size; i++) {
            if (todo_arr[i].getAssignedTo().equals(name)
                    && (todo_arr[i].getStatus().equals("todo"))
                    && (todo_arr[i].getImp())
                    && !(todo_arr[i].getUrgent())) {
                next_task = "" + todo_arr[i];
                ifcheck = true;
                break;
            }
        }
        if (!ifcheck) {
            next_task = "null";

        }
        return next_task;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        String ans = "", t;
        for (int i = 0; i < size; i++) {
            // System.out.println(todo_arr[i]);
            t = "" + todo_arr[i] + "\n";
            ans += t;
        }

        return ans;
    }
}
/**
 * Class for todoist main.
 */
public class TodoistMain {
    /**
     * Constructs the object.
     */
    TodoistMain() {

    }
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
                String[] tasks = todo.getNextTask(tokens[1], n);
                System.out.println(Arrays.deepToString(tasks));
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
        final int one = 1, two = 2, three = 3, four = 4, five = 5, six = 6;
        String title = tokens[one];
        String assignedTo = tokens[two];
        int timeToComplete = Integer.parseInt(tokens[three]);
        boolean important = tokens[four].equals("y");
        boolean urgent = tokens[five].equals("y");
        String status = tokens[six];
        try {
            Task task_item = new Task(
                title, assignedTo, timeToComplete, important, urgent, status);
            return task_item;
        } catch (Exception e) {
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