package com.main.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable{

    private boolean buttonClicked = false;

    @FXML
    private Button btnLichsu;

    @FXML
    private Button btnThanhvien;

    @FXML
    private Button btnThietbi;

    @FXML
    private Button btnThongke;

    @FXML
    private Button btnXuly;

    @FXML
    private AnchorPane leftmenu;

    @FXML
    private AnchorPane logo;

    @FXML
    private BorderPane main;

    @FXML
    private AnchorPane mainPanel;
	
    private Parent initialPanel;

    
    @FXML
    public void initialize() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("thanhvienFrame.fxml"));
            initialPanel = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void btnThanhvien_click(ActionEvent event) {
        if (!buttonClicked) {
            // Xử lý khi nút chưa được click
            btnThongke.setDisable(false);
            btnXuly.setDisable(false);
            btnLichsu.setDisable(false);
            btnThietbi.setDisable(false);
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("thanhvienFrame.fxml"));
                Parent panel = loader.load();

                if (!mainPanel.getChildren().contains(panel)) {
                    mainPanel.getChildren().setAll(panel);
                }

                // Đánh dấu nút đã được click và vô hiệu hóa nó
                buttonClicked = true;
                btnThanhvien.setDisable(true);
                buttonClicked = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    @FXML
    private void btnThietbi_click(ActionEvent event) {

        if (!buttonClicked) {
            btnThongke.setDisable(false);
            btnXuly.setDisable(false);
            btnLichsu.setDisable(false);
            btnThanhvien.setDisable(false);
            // Xử lý khi nút chưa được click
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("thietbiFrame.fxml"));
                Parent panel = loader.load();

                if (!mainPanel.getChildren().contains(panel)) {
                    mainPanel.getChildren().setAll(panel);
                }

                // Đánh dấu nút đã được click và vô hiệu hóa nó
                buttonClicked = true;
                btnThietbi.setDisable(true);
                buttonClicked = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private  void btnLichsu_click(ActionEvent event) {
        if (!buttonClicked) {
            // Xử lý khi nút chưa được click
            btnThongke.setDisable(false);
            btnXuly.setDisable(false);
            btnThietbi.setDisable(false);
            btnThanhvien.setDisable(false);
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("historyFrame.fxml"));
                Parent panel = loader.load();

                if (!mainPanel.getChildren().contains(panel)) {
                    mainPanel.getChildren().setAll(panel);
                }

                // Đánh dấu nút đã được click và vô hiệu hóa nó
                buttonClicked = true;
                btnLichsu.setDisable(true);
                buttonClicked = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnXuly_click(ActionEvent event) {
        if (!buttonClicked) {
            btnThongke.setDisable(false);
            btnLichsu.setDisable(false);
            btnThietbi.setDisable(false);
            btnThanhvien.setDisable(false);
            // Xử lý khi nút chưa được click
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("xulyFrame.fxml"));
                Parent panel = loader.load();

                if (!mainPanel.getChildren().contains(panel)) {
                    mainPanel.getChildren().setAll(panel);
                }

                // Đánh dấu nút đã được click và vô hiệu hóa nó
                buttonClicked = true;
                btnXuly.setDisable(true);
                buttonClicked = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @FXML
    private void btnThongke_click(ActionEvent event) {
        if (!buttonClicked) {
            btnXuly.setDisable(false);
            btnLichsu.setDisable(false);
            btnThietbi.setDisable(false);
            btnThanhvien.setDisable(false);
            // Xử lý khi nút chưa được click
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("thongkeFrame.fxml"));
                Parent panel = loader.load();

                if (!mainPanel.getChildren().contains(panel)) {
                    mainPanel.getChildren().setAll(panel);
                }

                // Đánh dấu nút đã được click và vô hiệu hóa nó
                buttonClicked = true;
                btnThongke.setDisable(true);
                buttonClicked = false;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}
	
}
