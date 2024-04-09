package com.main.project2;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class xoaTbController implements Initializable {

        @FXML
        private Button btnHuy;

        @FXML
        private Button btnXoa;

        @FXML
        private ComboBox<?> cbKhoa;

        @FXML
        private ComboBox<?> cbNganh;

        @FXML
        void btnXoa_click(ActionEvent event) {
            System.out.println("xóa");
        }


    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

    }

