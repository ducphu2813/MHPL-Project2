package com.main.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;

public class deleteTvController {
	  	@FXML
	    private Button btnHuy;

	    @FXML
	    private Button btn;

	    @FXML
	    private ComboBox<?> cbKhoa;

	    @FXML
	    private ComboBox<?> cbNganh;

	    @FXML
	    private RadioButton radKhoa;

	    @FXML
	    private RadioButton radNganh;
	    
	    @FXML
	    private void exit(ActionEvent event) {
	    	 Stage stage = (Stage) btnHuy.getScene().getWindow();
	         stage.close();
	    }
	    
	    @FXML
	    private void btnXoa_click(ActionEvent event) {
			System.out.println("Hello");
	    }
}
