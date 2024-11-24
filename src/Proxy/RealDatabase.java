package Proxy;

public class RealDatabase implements Database {
    private String dbName;

    public RealDatabase(String dbName) {
        this.dbName = dbName;
    }

    @Override
    public void connect() {
        System.out.println("Connecting to " + dbName);

    }
}
