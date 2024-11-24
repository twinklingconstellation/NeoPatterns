package Proxy;

public class DatabaseProxy  implements Database {

    private RealDatabase realDatabase;
    private String dbName;
    private String dbHost;

    public DatabaseProxy(String dbName, String dbHost) {
        this.dbName = dbName;
        this.dbHost = dbHost;
    }

    @Override
    public void connect() {
        String url = dbHost + "/" + dbName;
        if (realDatabase == null) {
            realDatabase = new RealDatabase(url);
        }
        realDatabase.connect();
    }
}
