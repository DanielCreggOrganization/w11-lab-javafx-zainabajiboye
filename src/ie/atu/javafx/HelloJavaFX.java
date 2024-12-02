package ie.atu.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {
    String name;
    @Override
    public void start(Stage primaryStage) {
        // Create the main content node
        //The Label is our content - the text we want to display
        Label welcomeLabel = new Label("Welcome to JavaFX!");
        welcomeLabel.setStyle("-fx-font-size: 20px;");
        System.out.println("Welcome to my app");
        System.out.println("Welcome " + name);
        
        // Create a container to hold our label
        //The StackPane is a container that centers its content
        StackPane root = new StackPane();
        root.getChildren().add(welcomeLabel);
        
        // Create and configure the scene
        //The Scene holds our layout
        Scene scene = new Scene(root, 300, 200);
        
        // Configure and show the stage
        //The Stage displays everything
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}