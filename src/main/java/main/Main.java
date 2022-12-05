package main;

import debug_tasks_4_and_5.Debug;
import singleton.InitializedSingleton;
import task_1.OutsideClass;
import access_modifiers_task_5.ExampleAllAccessModifiers;
import сonnection_task_8.ConnectionManager;

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
        debugoff_tasks_4_and_5.Debug debugOff = new debugoff_tasks_4_and_5.Debug();
        System.out.println(debug.debug("Hello Java"));
        System.out.println(debugOff.debug("Am I right ?") + "\n");

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
        InitializedSingleton con = InitializedSingleton.getInstance();
        ConnectionManager.getConnect();
    }
}
