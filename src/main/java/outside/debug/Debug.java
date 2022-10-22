/**
 * Create two packages: debug and debug off, containing an identical class with a debug( ) method.
 * The first version displays its String argument to the console, the second does nothing.
 * Use a static import line to import the class into a test program, and demonstrate the conditional compilation effect./
 */
package outside.debug;

public class Debug extends ClassWithProtectedMethod {
    public static void main(String[] args) {

        /* I can extend class ClassWithProtectedMethod and colling protected method showResult*/
        Debug debug = new Debug();
        debug.showResult("Hello");
    }

    public String debug(String s) {
        return s;
    }
}
