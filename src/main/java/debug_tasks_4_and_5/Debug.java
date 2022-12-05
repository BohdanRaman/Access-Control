/**
 * Create two packages: debug and debug off, containing an identical class with a debug( ) method.
 * The first version displays its String argument to the console, the second does nothing.
 * Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect./
 */
package debug_tasks_4_and_5;

public class Debug extends ClassWithProtectedMethodTask4 {
    public static void main(String[] args) {

        /* I can extend class ClassWithProtectedMethod and colling protected method showResult*/
        Debug debug = new Debug();
        System.out.println(debug.showResult("Hello World"));
    }

    public String debug(String s) {
        return s;
    }
}
