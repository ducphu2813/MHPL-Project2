package com.main.project2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import java.util.Optional;

public class addTvController {

    @FXML
    private Button btnHuy;

    @FXML
    private Button btnThem;

    @FXML
    private ComboBox<String> cbKhoa;

    @FXML
    private ComboBox<String> cbNganh;

    @FXML
    private TextField txtHoten;

    @FXML
    private TextField txtSdt;
    

    @FXML
    public void initialize() {
        ObservableList<String> data = FXCollections.observableArrayList(
            "Lựa chọn 1",
            "Lựa chọn 2",
            "Lựa chọn 3"
        );

        cbKhoa.setItems(data);
    }
    
    @FXML
    private void handleCancelButtonAction() {
        Stage stage = (Stage) btnHuy.getScene().getWindow();
        stage.close();
    }
    
    @FXML
    private void handleAddButtonAction(ActionEvent event) {
    	Alert alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Dialog");
        alert.setHeaderText("Bạn có chắc chắn muốn thêm không?");

        ButtonType buttonTypeYes = new ButtonType("Yes");
        ButtonType buttonTypeNo = new ButtonType("No");

        alert.getButtonTypes().setAll(buttonTypeYes, buttonTypeNo);

        Optional<ButtonType> result = alert.showAndWait();
        if (result.isPresent() && result.get() == buttonTypeYes) {
            System.out.println("Bạn đã chọn Yes.");
            // Thực hiện hành động tương ứng với Yes ở đây
        } else {
            System.out.println("Bạn đã chọn No hoặc đóng hộp thoại.");
            // Thực hiện hành động tương ứng với No ở đây
        }
    }

}
