package controller;

/**
 * @author Marko Orlando
 * date 06/11/2024
 * Controller for the Main Application stage, or the webpage
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

/**
 * Loads the github webpage
 */
public class MainAppController implements Initializable {

		@FXML
		private WebView webView;
		
		@FXML
		private TextField textField;
		
		private WebEngine engine;
		
		@Override
		
		/**
		 *  Loads the webpage
		 * @param arg0 The url we want to open
		 * @param arg1 The resource bundle (unused in this instance)
		 */
		public void initialize(URL arg0, ResourceBundle arg1) {
			
			engine = webView.getEngine();
			loadPage();
		}
		
		/**
		 * Specifies the web address we want to open
		 */
		public void loadPage() {
			engine.load("https://github.com/markodante");
		}

	}
	