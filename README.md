# LoginFX

This project allows a user to register a username and password which are used to log onto to a webpage containing the Github account of famous computer scientist Marko Orlando.

## Resources

GPT prompt #2:

If I have a JavaFx Program with a database like so:

package data;

/**
 * @author Marko Orlando
 * date 06/11/2024
 * A database that holds the users username and password
 */
public final class Database {

	// Private constructor 
	// (Don't let anyone create a `new` Database)
	private Database() {}
	
	public static String username = "";
	public static String password = "";
}

How do I get the username and password input from this register controller to fill up the database username and password?

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

public class RegisterController {

	@FXML
	public TextField usernameInput;
	@FXML
	public PasswordField passwordInput;

	/**
	 * Saves the users username and password to the database
	 * @param event An event that occurs when the Ok button is pressed
	 * @throws IOException
	 */
	public void okButtonPressed(ActionEvent event) throws IOException {
		username = usernameInput.getText();
		password = passwordInput.getText();
	
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