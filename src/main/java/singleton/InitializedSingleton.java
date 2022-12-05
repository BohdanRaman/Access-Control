package singleton;

public class InitializedSingleton {
    private static InitializedSingleton instance;

    private InitializedSingleton() {
    }

    public static InitializedSingleton getInstance() {
        if (instance == null) {
            instance = new InitializedSingleton();
        }
        return instance;
    }
}
