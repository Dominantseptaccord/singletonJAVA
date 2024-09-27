package org.example;

public class DatabaseConnection {
    private DatabaseConnection(){ // constructor private to not create new object, except that we use DatabaseConnesction.getInstance();
    }
    private static volatile DatabaseConnection instance; // volatile is used in Java to ensure that changes to a variable are visible between threads.
    public static DatabaseConnection getInstance() { // method to get the current object, create or get the exixts.
        if (instance == null) {
            synchronized (DatabaseConnection.class) { // First check: We check if the instance is created if(instance == null) and if it is not created, we lock the DatabaseConnection class using synchronized.
                if (instance == null) { // Second check: After the thread has the lock, we check again if someone created the object if(instance == null) before creating a new instance.
                    instance = new DatabaseConnection(); // doing instance the current object
                }
            }
        }
        return instance;
    }
    // typical connecting and disconnecting.
    public void connect(){
        System.out.println("Connecting to the DatabaseConnection");
    }
    public void disconnect(){
        System.out.println("Disconnecting from the DatabaseConnection");
    }
}
