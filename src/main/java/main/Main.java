package main;

import debug.Debug;
import debug.OutsideClass;
import access_modifiers.ExampleAllAccessModifiers;
import сonnection.ConnectionManager;

public class Main {
    public static void main(String[] args) {

        /* Task 1*/
        System.out.println("Task 1" + "\n");
        OutsideClass outsideClass = new OutsideClass();

        /* Task 3,4*/
        System.out.println("Task 3,4");
        Debug debug = new Debug();
        /* I Can’t use package-access member from another package. Class main.Main is not in the package Debug
         * and I don't colling protected method showResult */
        debugoff.Debug debugOff = new debugoff.Debug();
        System.out.println(debug.debug("Hello Java"));
        System.out.println(debugOff.debug("Ogo-go") + "\n");

        /* Task 5*/
        System.out.println("Task 5");
        ExampleAllAccessModifiers modifiers = new ExampleAllAccessModifiers();
        /* I can access member witch have modifier public.*/
        System.out.println(modifiers.age);
        System.out.println(modifiers.getMyAge());

        /* But if I created mutators, I can access fields */
        System.out.println(modifiers.getAge());
        System.out.println(modifiers.getSurName());
        System.out.println(modifiers.getName());
        System.out.println(modifiers.getNumber() + "\n");

        /* Task 8*/
        System.out.println("Task 8");
        ConnectionManager connectionManager = new ConnectionManager();
        System.out.println(ConnectionManager.getConnect());

    }
}