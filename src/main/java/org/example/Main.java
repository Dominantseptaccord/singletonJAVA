package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {

    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getInstance(); // using method to initilize connection1 to instance object
        connection1.connect();
        DatabaseConnection connection2 = DatabaseConnection.getInstance(); // initilizing the поле connection2 to the object instance
        connection2.connect(); // connecting)
        System.out.println(connection1); // showing that the object has the hashcode object
        System.out.println(connection2); // they are the same as the connection1
        if (connection1 == connection2){ // boolean connection1 == connection2, is the objects are the same? Yeah, they are the same.
            System.out.println("true"); // Worked and show us true;
        }
        else {
            System.out.println("false"); // not worked.
        }
        connection1.disconnect(); // disconnecting(
        connection2.disconnect();
    }
}
