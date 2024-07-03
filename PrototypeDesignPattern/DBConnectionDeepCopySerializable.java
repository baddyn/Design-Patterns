package org.example.PrototypeDesignPattern;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class DBConnectionDeepCopySerializable implements Cloneable,Serializable{
    public DBConnectionDeepCopySerializable(String ip) {
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
    public DBConnectionDeepCopySerializable clone() {

        //Use  serialization and deserialization to clone object.

        try {
            // Serialize the object to a byte array
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this);

            // Deserialize the object from the byte array
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return (DBConnectionDeepCopySerializable) ois.readObject();


        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }


    }
}
