import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class InventoryManagementApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        // UI components
        // ...

        // Event handlers
        // ...

        // Layout setup
        // ...

        Scene scene = new Scene(root, 800, 600);
        primaryStage.setTitle("Inventory Management System");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


import java.sql.*;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/inventory_db";
    private static final String DB_USER = "your_db_username";
    private static final String DB_PASSWORD = "your_db_password";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


public class Item {
    private int id;
    private String name;
    private String category;
    private double price;
    private int quantity;

    // Constructors, getters, setters
    // ...
}

public class InventoryManager {
    public void addItem(Item item) {
        // Add item to the database
    }

    public void updateItemQuantity(int itemId, int newQuantity) {
        // Update item quantity in the database
    }

    public List<Item> getAllItems() {
        // Fetch all items from the database
    }

    // Other methods for managing items
    // ...
}