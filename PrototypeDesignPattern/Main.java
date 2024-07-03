package org.example.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //ShallowCopy
        System.out.println("Creating original object shallow copy");
        DBConnectionShallowCopy dbConnection = new DBConnectionShallowCopy("192.168.0.1");

        System.out.println("Creating db connection, takes 5 seconds");
        dbConnection.createDbConnection();
        System.out.println(dbConnection);

        System.out.println("Creating clone, instant");
        DBConnectionShallowCopy dbConnectionClone = dbConnection.clone();
        dbConnectionClone.getPorts().remove(0);
        System.out.println(dbConnectionClone);

        System.out.println("original object also modified due to shallow copy");
        System.out.println(dbConnection);


        //DeepCopy

        System.out.println("Creating original object deep copy");
        DBConnectionDeepCopy dbConnectionDeep = new DBConnectionDeepCopy("192.168.0.1");

        System.out.println("Creating db connection, takes 5 seconds");
        dbConnectionDeep.createDbConnection();
        System.out.println(dbConnectionDeep);

        System.out.println("Creating clone, instant");
        DBConnectionDeepCopy dbConnectionDeepClone = dbConnectionDeep.clone();
        dbConnectionDeepClone.getPorts().remove(0);
        System.out.println(dbConnectionDeepClone);

        System.out.println("original object not modified so deep copy");
        System.out.println(dbConnectionDeep);

        //DeepCopy Serialization

        System.out.println("Creating original object deep copy");
        DBConnectionDeepCopySerializable dbConnectionDeepCopySerializable = new DBConnectionDeepCopySerializable("192.168.0.1");

        System.out.println("Creating db connection, takes 5 seconds");
        dbConnectionDeepCopySerializable.createDbConnection();
        System.out.println(dbConnectionDeepCopySerializable);

        System.out.println("Creating clone, instant");
        DBConnectionDeepCopySerializable dbConnectionDeepCopySerializableClone = dbConnectionDeepCopySerializable.clone();
        dbConnectionDeepCopySerializableClone.getPorts().remove(0);
        System.out.println(dbConnectionDeepCopySerializableClone);

        System.out.println("original object not modified so deep copy");
        System.out.println(dbConnectionDeepCopySerializable);

    }
}
