package controller;

/**
 * @author Marko Orlando
 * date 06/11/2024
 * A controller for the Login stage
 */

import java.io.IOException;

import data.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Allows the user to log onto the next page
 */
public class LoginController {
	
	@FXML
	public TextField tfUsername;
	
	@FXML
	public PasswordField pfPassword;
	
	@FXML
	public Label lblError;

	/**
	 * Determines whether the login info a user provides is valid or not
	 * 
	 * @param event An event that occurs when the login button is pressed
	 * @throws IOException Throws if the exception occurs when loading
	 */
	public void loginButtonPressed(ActionEvent event) throws IOException {
		// Get the user name and password

		String username = tfUsername.getText();
		String password = pfPassword.getText();

		if (!username.equals(Database.username) || !password.equals(Database.password)) {
			lblError.setText("Invalid username or password.");
			lblError.setVisible(true);
			return;
		}

		// Switch scenes to MainApp
		Parent root = FXMLLoader.load(getClass().getResource("/view/MainApp.fxml"));

		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		Scene scene = new Scene(root);
		appStage.setScene(scene);
	}

}