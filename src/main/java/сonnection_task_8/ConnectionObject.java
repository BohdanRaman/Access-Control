package сonnection_task_8;

public class ConnectionObject {
    private int connectNumber;
    private String name;

    public ConnectionObject() {
    }

    protected ConnectionObject(int connectNumber, String name) {
        this.connectNumber = connectNumber;
        this.name = name;
    }

    public int getConnectNumber() {
        return connectNumber;
    }

    public void setConnectNumber(int connectNumber) {
        this.connectNumber = connectNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
