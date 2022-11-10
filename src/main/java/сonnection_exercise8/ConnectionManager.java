/**
 * Exercise 8:Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The client
 * programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager. When the ConnectionManager runs out of
 * objects, it returns a null reference. Test the classes in main( ).
 */

package сonnection_exercise8;

import singleton.Singleton;

public class ConnectionManager {

    public static void getConnect() {
        ConnectionObject[] connection = new ConnectionObject[3];
        connection[0] = new ConnectionObject(1, "Object_1");
        connection[1] = new ConnectionObject(2, "Object_2");
        connection[2] = new ConnectionObject(3, "Object_3");
        for (int i = 0; i < 3; i++) {
            System.out.println("Age: " + connection[i].getAge() + " ; Name: " + connection[i].getName());
        }
    }

    public void methodWithSingleton() {
        Singleton.getConnectionManager();
    }
}

class ConnectionObject {
    private int age;
    private String name;

    public ConnectionObject(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}