import java.util.Scanner;
import java.util.Arrays;

/**
  * write your code below this comment
  */
class Task {
    private String title;
    private String assignedTo;
    private int timeTocomplete;
    private boolean important;
    private boolean urgency;
    private String status;
    String importance;
    String urgent;


    Task(String title, String assignedTo, int timeTocomplete, boolean important, boolean urgent, String status) {
        this.title = title;
        this.assignedTo = assignedTo;
        this.timeTocomplete = timeTocomplete;
        this.important = important;
        this.urgency = urgency;
        this.status = status;
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
            System.out.println(e);
        }
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
        return title + ", " + assignedTo + ", " + timeTocomplete + ", " + importance + ", " + urgent + ", " + status;
    }

class Todoist {
    Task[] arr;
    int size;
    Todoist() {
        Task[] arr = new Task[20];
        size = 0;
    }
    public void addTask(Task task) {
        if (size < arr.length) {
            arr[size++] = task;
        } else {
            resize(task);
        }
    }
    public void resize(Task task) {
        arr = Arrays.copyOf(arr, 2 * size);
        arr[size++] = task;
    }
    public String toString(){
        for(int i = 0; i < size; i++) {
			String todo = arr[i].toString();
			System.out.println(todo);
		}
		return "";
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
            // case "get-next":
            //     System.out.println(todo.getNextTask(tokens[1]));
            //     break;
            // case "get-next-n":
            //     int n = Integer.parseInt(tokens[2]);
            //     Task[] tasks = todo.getNextTask(tokens[1], n);
            //     System.out.println(Arrays.deepToString(tasks));
            //     break;
            // case "total-time":
            //     System.out.println(todo.totalTime4Completion());
            //     break;
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
            System.out.println(createTask(tokens));
        } catch (Exception e) {
            System.out.println(e.getMessage());
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
        return new Task(
                   title, assignedTo, timeToComplete, important, urgent, status);
    }

    /**
     * main method.
     *
     * @param      args  The command line arguments
     */
    public  void main(final String[] args) {
        startTest();
    }
}
}
