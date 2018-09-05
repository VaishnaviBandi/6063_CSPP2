import java.util.Scanner;

/*
 * In the previous module you have created List ADT.
 * ADTs are developed as reusable libraries
 * i.e., anyone who needs the ADT can use it in their program
 * A program that uses the ADT is called a "client" of the ADT
 * The client typically instantiates an object of the ADT
 * and invokes the public methods on the ADT object.
 *
 * This assignment is to practice the idea of client to the ADT.
 * Client class is Fibonacci and the client needs to use the List ADT
 * to store fibonacci numbers in the List ADT.
 * So, Fibonacci is going to instantiate an object of List ADT
 * generate fibonacci numbers and add them to the list
 * by invoking the add method provided in the List ADT.
 *
 */
/**.
 * { item_description }
 */
public final class Fibonacci {
    /**.
     * Constructs the object.
     */
    private Fibonacci() {

    }
    /*
     * fib is a static method takes a argument n
     * n is the count of the fibonacci numbers to be generated.
     * The method returns a List with the n fibonacci numbers.
     *
     * Look for the hint.txt if some of the testcases fail.
     */
    /**.
     * {generates fibonacci series and returns it in a list }
     *
     * @param      n     { parameter_description }
     *
     * @return     { description_of_the_return_value }
     */
    public static List fib(final int n) {
        // todo - complete this method
        List fibonacci = new List();
        int f1 = 0;
        int f2 = 1;
        int sum;
        fibonacci.add(f1);
        fibonacci.add(f2);
        // if(n == 1 || n == 2) {
        //     obj.add(1)
        //     // return 1;
        // }
        // fib1 = fib(n-1) + fib(n -2);
        // obj.add(fib1);
        for (int i = 1; i <= n - 2; i++) {
            // int index = fibonacci.size();
            // int next = fibonacci.get(index-1) + fibonacci.get(index-2);
            int fib = f1 + f2;
            f1 = f2;
            f2 = fib;
            fibonacci.add(fib);
        }
        return fibonacci;
    }
    /**.
     * { function_description: main function}
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(fib(n));
    }
}
