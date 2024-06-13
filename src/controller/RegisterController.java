package controller;

/**
 * @author Marko Orlando
 * date 06/11/2024
 * Controller for the register stage
 */

import java.io.IOException;

import data.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/**
 * Allows the user to register a username and password
 */
public class RegisterController {

	@FXML
	public TextField usernameInput;
	
	@FXML
	public PasswordField passwordInput;

	/**
	 * Saves the users username and password to the database
	 * @param event An event that occurs when the Ok button is pressed
	 * @throws IOException throws the IOException
	 */
	public void okButtonPressed(ActionEvent event) throws IOException {
		Database.username = usernameInput.getText();
		Database.password = passwordInput.getText();
	
		Parent root = FXMLLoader.load(
				getClass().getResource("/view/Login.fxml")
		);
		
		Stage appStage = (Stage)((Node)event.getSource())
							.getScene()
							.getWindow();
		Scene scene = new Scene(root);
		appStage.setScene(scene);
	}
	
}