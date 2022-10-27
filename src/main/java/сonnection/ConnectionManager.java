/**
 * Exercise 8:Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The client
 * programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager. When the ConnectionManager runs out of
 * objects, it returns a null reference. Test the classes in main( ).
 */
package сonnection;

public class ConnectionManager {
    private static final int MANAGER = 3;

    public static void getConnect() {
        ConnectionManager[] connection = new ConnectionManager[MANAGER];
        for (ConnectionManager c : connection) {
            System.out.println(c);
        }
    }
}

  /*
        public void methodConnection() {
        connectionManager = Singleton.getConnectionManager();
    }
   */