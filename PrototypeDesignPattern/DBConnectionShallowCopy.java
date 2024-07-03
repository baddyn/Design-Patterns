package org.example.PrototypeDesignPattern;
import java.util.ArrayList;
import java.util.List;
public class DBConnectionShallowCopy implements Cloneable{
    public DBConnectionShallowCopy(String ip) {
        this.ip = ip;
    }

    private String ip;
    private String dbConnection;

    public List<String> getPorts() {
        return ports;
    }

    public void setPorts(List<String> ports) {
        this.ports = ports;
    }

    private List<String> ports = new ArrayList<>();

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getDbConnection() {
        return dbConnection;
    }

    public void setDbConnection(String dbConnection) {
        this.dbConnection = dbConnection;
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.dbConnection + " : " + this.ports ;
    }

    public void createDbConnection() throws InterruptedException {
        ports.add("443");
        ports.add("80");
        this.dbConnection = "dbConnection";
        Thread.sleep(5000);
    }

    @Override
    public DBConnectionShallowCopy clone() {
        try {
            return (DBConnectionShallowCopy) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            throw new AssertionError();
        }
    }
}
