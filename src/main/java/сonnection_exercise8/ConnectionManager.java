/**
 * Exercise 8:Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The client
 * programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager. When the ConnectionManager runs out of
 * objects, it returns a null reference. Test the classes in main( ).
 */

package сonnection_exercise8;

public class ConnectionManager {

    public static void getConnect() {
        ConnectionObject[] connection = new ConnectionObject[3];
        connection[0] = new ConnectionObject(1, "Connect_1");
        connection[1] = new ConnectionObject(2, "Connect_2");
        connection[2] = new ConnectionObject(3, "Connect_3");
        for (int i = 0; i < 3; i++) {
                System.out.println("Connection Number: " + connection[i].getConnectionNumber() + " ; Name: " + connection[i].getConnectionName());
            }
        }

}

class ConnectionObject {
    private int connectionNumber;
    private String connectionName;

    public ConnectionObject(int connectionNumber, String name) {
        this.connectionNumber = connectionNumber;
        this.connectionName = name;
    }

    public int getConnectionNumber() {
        return connectionNumber;
    }

    public void setConnectionNumber(int connectionNumber) {
        this.connectionNumber = connectionNumber;
    }

    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

}