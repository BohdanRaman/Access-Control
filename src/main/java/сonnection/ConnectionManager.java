/**
 * Exercise 8:Following the form of the example Lunch.java, create a class called
 * ConnectionManager that manages a fixed array of Connection objects. The client
 * programmer must not be able to explicitly create Connection objects, but can only get them
 * via a static method in ConnectionManager. When the ConnectionManager runs out of
 * objects, it returns a null reference. Test the classes in main( ).
 */
/*Следуя форме примера Lunch.java, создайте класс с именем ConnectionManager, который управляет фиксированным массивом объектов Connection.
Клиентский программист не должен иметь возможности явного создания объектов Connection, а может только получить их из статического метода в ConnectionManager.
Когда в ConnectionManager параметр выходит за пределы объектов, он возвращает ссылку на null. Проверьте классы в main( ).*/

package сonnection;

public class ConnectionManager {

    public static Object getConnect() {
        ConnectionManager[]   connection = new ConnectionManager[6];
        for (int i = 0; i < connection.length; i++) {
            System.out.println(connection[i]);
        }
        return null;
    }
}