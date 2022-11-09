package singleton;

import сonnection_exercise8.ConnectionManager;

public class Singleton {
    private static ConnectionManager connectionManager;

    private Singleton() {
    }

    public static ConnectionManager getConnectionManager() {
        if (connectionManager == null) {
            connectionManager = new ConnectionManager();
        }
        return connectionManager;
    }


}
