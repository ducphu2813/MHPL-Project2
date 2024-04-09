package com.main.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class thanhvienController implements Initializable {

    @FXML
    private Button btnCheck;

    @FXML
    private Button btnExcel;

    @FXML
    private Button btnThem;

    @FXML
    private Button btnXoadk;

    @FXML
    private AnchorPane crudPanel;

    @FXML
    private AnchorPane tablePanel;
    
    @FXML
    private void btnThem_click(ActionEvent event) {
    	try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("addTvFrame.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void btnXoadk_click(ActionEvent event) {
    	try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("deleteFrame.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnCheck_click(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("checkBan.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnExcel_click(ActionEvent event) {
        System.out.println("btnExcel_click");
    }

    @FXML
    private void btnTheme_click(ActionEvent event) {
        System.out.println("J");
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle){

    }


}
