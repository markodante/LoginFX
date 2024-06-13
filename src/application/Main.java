package application;

/**
 * @author Marko Orlando
 * date 06/11/2024
 * Main method of my Github webpage viewer
 */

	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Opens up the register stage
 */
public class Main extends Application {
	@Override
	
	/**
	 * Opens up the Registration stage
	 * @param primaryStage The first stage that is to be opened (the registration stage in this instance)
	 * @throws IOException Throws if the exception occurs when loading
	 */
	public void start(Stage primaryStage) throws IOException {
		// Declare the root (the first scene we want to open)
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/Register.fxml")
		);
		
		// Set our scene to take in our root as its parameter
		Scene scene = new Scene(root);
	
		// Make sure the user can't resize the window
		primaryStage.setResizable(false);
		
		// Display the scene
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	/**
	 * Main method
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}