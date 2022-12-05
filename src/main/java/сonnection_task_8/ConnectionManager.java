/**
 * Exercise 8:Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The client
 * programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager. When the ConnectionManager runs out of
 * objects, it returns a null reference. Test the classes in main( ).
 */

package сonnection_task_8;

public class ConnectionManager {
    private static ConnectionManager manager;

    public static ConnectionManager getInstance() {
        if (manager == null) {
            manager = new ConnectionManager();
        }
        return manager;
    }

    private static final ConnectionObject connectionObject = new ConnectionObject();

    public ConnectionObject getObject() {
        ConnectionObject[] connection = new ConnectionObject[3];
        connection[0] = new ConnectionObject(1, "Object_1");
        connection[1] = new ConnectionObject(2, "Object_2");
        connection[2] = new ConnectionObject(3, "Object_3");

        for (int i = 0; i < 3; i++) {
            System.out.println("connectNumber: " + connection[i].getConnectNumber() + "; Name: " + connection[i].getName());
        }
        return connectionObject;
    }
}