package ie.atu.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class LoginForm extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a grid layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25));
        
        // Add form elements
        Label usernameLabel = new Label("Username:");
        grid.add(usernameLabel, 0, 0); // column 0, row 0
        
        TextField usernameField = new TextField();
        grid.add(usernameField, 1, 0); // column 1, row 0
        
        Label passwordLabel = new Label("Password:");
        grid.add(passwordLabel, 0, 1); // column 0, row 1
        
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 1); // column 1, row 1
        
        Button loginButton = new Button("Login");
        grid.add(loginButton, 1, 2); // column 1, row 2
        
        // Create scene and show
        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}