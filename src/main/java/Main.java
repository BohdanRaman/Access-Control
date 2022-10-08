import debug.Debug;
import debugoff.*;
import outside.OutsideClass;

public class Main {
    public static void main(String[] args) {


        /* Task 1*/
        System.out.println("Task 1" + "\n");
        OutsideClass outsideClass = new OutsideClass();

        /* Task 3*/
        System.out.println("Task 3");
        Debug debug = new Debug();
        debug.debug("Example debug");

        debugoff.Debug debugOff = new debugoff.Debug();


    }
}
