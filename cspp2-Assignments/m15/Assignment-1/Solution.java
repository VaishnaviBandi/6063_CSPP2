import java.io.BufferedInputStream;
import java.util.Scanner;
import java.util.Arrays;
/**.
 * List of .
 */
class List {
    /**.
     * { var_description }
     */
    private int[] list;
    /**.
     * { var_description }
     */
    private int size;
    /**
     * Constructs the object.
     */
    List() {
        final int ten = 10;
        list = new int[ten];
        size = 0;
    }
    /**.
     * { function_description }
     */
    public void resize() {
        list = Arrays.copyOf(list, list.length * 2);
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     */
    public void add(final int item) {
        if (size == list.length) {
            resize();
        }
        list[size++] = item;
    }
    /**.
     * { function_description }
     *
     * @return     { description_of_the_return_value }
     */
    public int size() {
        return size;
    }
    /**.
     * { function_description }
     *
     * @param      index      The index
     *
     * @throws     Exception  { exception_description }
     */
    public void remove(final int index) throws Exception {
        if (index >= 0 && index <= size) {
            for (int i = index; i <= size; i++) {
                list[i] = list[i + 1];
            }
            size--;
        } else {
            throw new Exception("Invalid Position Exception");
        }
    }
    /**.
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
    public String toString() {
        if (size == 0) {
            return "[]";
        } else {
            String str = "[";
            int i = 0;
            for (i = 0; i < size - 1; i++) {
                str += list[i] + ",";
            }
            str += list[i] + "]";
            return str;
        }
    }
    /**.
     * Searches for the first match.
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int indexOf(final int item) {
        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                return i;
            }
        }
        return -1;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public boolean contains(final int item) {
        // Replace the code below
        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                return true;
            }
        }
        return false;
    }
    /**.
     * Adds all.
     *
     * @param      arra  The arra
     */
    public void addAll(final int[] arra) {
        for (int i = 0; i < arra.length; i++) {
            add(arra[i]);
        }
    }
    /**.
     * { function_description }
     *
     * @param      index    The index
     * @param      element  The element
     */
    public void add(final int index, final int element) {
        size++;
        for (int i = size - 1; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = element;
    }
    /**.
     * { function_description }
     *
     * @param      item  The item
     *
     * @return     { description_of_the_return_value }
     */
    public int count(final int item) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (item == list[i]) {
                count++;
            }
        }
        return count;
    }
    /**.
     * Removes all.
     *
     * @param      newArray   The new array
     *
     * @throws     Exception  { exception_description }
     */
    public void removeAll(final int[] newArray) throws Exception {
        for (int each : newArray) {
            for (int i = 0; i < newArray.length; i++) {
                if (contains(newArray[i])) {
                    remove(indexOf(newArray[i]));
                }
            }
        }
    }
    /**.
     * { function_description }
     *
     * @param      list1  The list 1
     *
     * @return     { description_of_the_return_value }
     */
    public boolean equals(final List list1) {
        if (this == list1) {
            return true;
        }
        return this.toString().equals(list1.toString());
    }
    /**.
     * { function_description }
     */
    public void clear() {
        size = 0;

    }
    /**.
     * { function_description }
     *
     * @param      start      The start
     * @param      end        The end
     *
     * @return     { description_of_the_return_value }
     *
     * @throws     Exception  { exception_description }
     */
    public List subList(final int start, final int end) throws Exception {
        if (start < 0 || end < 0 || start >= end
                || start > size || end > size) {
            throw new Exception("Index Out of Bounds Exception");
        } else {
            List list1 = new List();
            for (int i = start; i < end; i++) {
                list1.add(list[i]);
            }
            return list1;
        }
    }
    /**.
     * { function_description }
     *
     * @param      index  The index
     *
     * @return     { description_of_the_return_value }
     */
    public int get(final int index) {
        if (index >= 0 && index < size) {
            return list[index];
        } else {
            return -1;
        }
    }
}
/**.
 * Class for solution.
 */
class Solution {
    private Solution() { }
    /**.
     * { function_description }
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        List l = new List();
        Scanner stdin = new Scanner(new BufferedInputStream(System.in));

        while (stdin.hasNext()) {
            String line = stdin.nextLine();
            String[] tokens = line.split(" ");
            switch (tokens[0]) {
            case "add":
                if (tokens.length == 2) {
                    String[] t = tokens[1].split(",");
                    if (t.length == 1) {
                        l.add(Integer.parseInt(tokens[1]));
                    }
                    if (t.length == 2) {
                        l.add(Integer.parseInt(t[0]), Integer.parseInt(t[1]));
                    }
                }
                break;
            case "size":
                System.out.println(l.size());
                break;
            case "print":
                System.out.println(l);
                break;
            case "remove":
                try {
                    if (tokens.length == 2) {
                        l.remove(Integer.parseInt(tokens[1]));
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "indexOf":
                if (tokens.length == 2) {
                    System.out.println(l.indexOf(
                                           Integer.parseInt(tokens[1])));
                }
                break;
            case "get":
                if (tokens.length == 2) {
                    System.out.println(l.get(
                                           Integer.parseInt(tokens[1])));
                }
                break;
            case "contains":
                if (tokens.length == 2) {
                    System.out.println(l.contains(
                                           Integer.parseInt(tokens[1])));
                }
                break;
            case "addAll":
                if (tokens.length == 2) {
                    String[] t1 = tokens[1].split(",");
                    int[] temp = new int[t1.length];
                    for (int i = 0; i < temp.length; i++) {
                        temp[i] = Integer.parseInt(t1[i]);
                    }
                    l.addAll(temp);
                }
                break;
            case "removeAll":
                if (tokens.length == 2) {
                    String[] t2 = tokens[1].split(",");
                    int[] a = new int[t2.length];
                    for (int i = 0; i < t2.length; i++) {
                        a[i] = Integer.parseInt(t2[i]);
                    }
                    try {
                        l.removeAll(a);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }
                break;
            case "subList":
                try {
                    if (tokens.length != 2) {
                        break;
                    }
                    String[] arrstring3 = tokens[1].split(",");
                    List object = l.subList(
                                      Integer.parseInt(arrstring3[0]),
                                      Integer.parseInt(arrstring3[1]));
                    if (object != null) {
                        System.out.println(object);
                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                break;
            case "equals":
                if (tokens.length == 2) {
                    String[] lt = tokens[1].split(",");
                    List l2 = new List();
                    for (int k = 0; k < lt.length; k++) {
                        l2.add(Integer.parseInt(lt[k]));
                    }
                    System.out.println(l.equals(l2));
                }
                break;
            case "clear":
                l.clear();
                break;
            case "count":
                if (tokens.length == 2) {
                    System.out.println(l.count(
                                           Integer.parseInt(tokens[1])));
                }
                break;
            default:
                break;
            }
        }
    }
}