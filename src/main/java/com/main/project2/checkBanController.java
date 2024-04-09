package com.main.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class checkBanController {
    @FXML
    private Button btnCheck;

    @FXML
    private TextField txtKhoa;

    @FXML
    private TextField txtMa;

    @FXML
    private TextField txtNganh;

    @FXML
    private TextField txtSdt;

    @FXML
    private TextField txtTen;

    @FXML
    private void btnCheckOnAction(ActionEvent event) {
        System.out.println("Event btncheck");
    }

}
