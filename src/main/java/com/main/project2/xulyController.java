package com.main.project2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class xulyController {


    @FXML
    private VBox boxNgaymuon;

    @FXML
    private Button btnThem;

    @FXML
    private DatePicker dtpEnd;

    @FXML
    private DatePicker dtpStart;

    @FXML
    private Tab tabChuaxuly;

    @FXML
    private Tab tabDaxuly;

    @FXML
    private Tab tabTatca;

    @FXML
    private TableView<?> tbAll;

    @FXML
    private TableColumn<?, ?> tbChuaxuly;

    @FXML
    private TableView<?> tbDaxuly;

    @FXML
    private TableView<?> tbLichsu2;

    @FXML
    private void btnThem_click(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("themXuLyFrame.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
