import debug.ClassWithProtectedMethod;
import debug.Debug;
import debugoff.*;
import outside.OutsideClass;
import task6.ExampleAllAccessModifiers;

public class Main {
    public static void main(String[] args) {

        /* Task 1*/
        System.out.println("Task 1" + "\n");
        OutsideClass outsideClass = new OutsideClass();

        /* Task 3,4*/
        System.out.println("Task 3,4");
        Debug debug = new Debug();
        /* I Can’t use package-access member from another package. Class Main is not in the package Debug
         * and I don't colling protected method showResult */
        debugoff.Debug debugOff = new debugoff.Debug();
        System.out.println(debug.debug("Hello Java"));
        System.out.println(debugOff.debug("Ogo-go") + "\n");

        /* Task 6*/
        System.out.println("Task 6");
        ExampleAllAccessModifiers modifiers = new ExampleAllAccessModifiers();
        /* I can access member witch have modifier public.*/
        System.out.println(modifiers.age);
        System.out.println(modifiers.getMyAge());

        /* But if I created mutators, I can access fields */
        System.out.println(modifiers.getAge());
        System.out.println(modifiers.getSurName());
        System.out.println(modifiers.getName());
        System.out.println(modifiers.getNumber());
    }
}
