package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{	
	
	@FXML TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Label labelErrorName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void onBtnSave() {
		System.out.println("btnsave");
	}

	@FXML
	public void onBtnCancel() {
		System.out.println("btnCancel");
	}
	
	@FXML
	public void initialize(URL url, ResourceBundle resourceBundle) {
		InitializeNodes();
	}
	
	@FXML
	private void InitializeNodes() {
		Constraints.setTextFieldInteger(txtId);
		Constraints.setTextFieldMaxLength(txtName, 30);
		
	}
}
