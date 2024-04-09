package com.main.project2;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class historyController {

    @FXML
    private VBox boxDoituong;

    @FXML
    private VBox boxNgayTra;

    @FXML
    private VBox boxNgaymuon;

    @FXML
    private VBox boxTime;

    @FXML
    private ComboBox<?> cbxDoituong;

    @FXML
    private DatePicker dtpEndBr;

    @FXML
    private HBox dtpEndGb;

    @FXML
    private DatePicker dtpStartBr;

    @FXML
    private DatePicker dtpStartGb;

    @FXML
    private TableView<?> tbLichsu;

    @FXML
    private TextField txtDoituong;

}
