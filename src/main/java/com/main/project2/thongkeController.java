package com.main.project2;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class thongkeController implements Initializable {

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private ComboBox<?> cbKhoa;

    @FXML
    private ComboBox<?> cbNam;

    @FXML
    private ComboBox<?> cbNganh;

    @FXML
    private ToggleGroup group1;

    @FXML
    private ToggleGroup group2;

    @FXML
    private RadioButton rdAll1;

    @FXML
    private RadioButton rdAll2;

    @FXML
    private RadioButton rdKhoa;

    @FXML
    private RadioButton rdNganh;

    @FXML
    private RadioButton rdchuaxuly;

    @FXML
    private RadioButton rddaxuly;

    @FXML
    private TableView<?> tableVipham;

    @FXML
    private TextField txtMa;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        CategoryAxis xAxis = (CategoryAxis) barChart.getXAxis();
        xAxis.setCategories(FXCollections.observableArrayList(
                "T1", "T2", "T3", "T4", "T5", "T6",
                "T7", "T8", "T9", "T10", "T11", "T12"
        ));

        // Tạo dữ liệu cho các tháng
        XYChart.Series<String, Number> dataSeries = new XYChart.Series<>();
        dataSeries.getData().add(new XYChart.Data<>("T1", 10));
        dataSeries.getData().add(new XYChart.Data<>("T2", 40));
        dataSeries.getData().add(new XYChart.Data<>("T3", 50));
        dataSeries.getData().add(new XYChart.Data<>("T4", 60));
        dataSeries.getData().add(new XYChart.Data<>("T5", 30));
        dataSeries.getData().add(new XYChart.Data<>("T6", 10));
        dataSeries.getData().add(new XYChart.Data<>("T7", 50));
        dataSeries.getData().add(new XYChart.Data<>("T8", 70));
        dataSeries.getData().add(new XYChart.Data<>("T9", 90));
        dataSeries.getData().add(new XYChart.Data<>("T10", 75));
        dataSeries.getData().add(new XYChart.Data<>("T11", 40));
        dataSeries.getData().add(new XYChart.Data<>("T12", 100));

        // Đặt màu xanh dương cho cột
        for (XYChart.Data<String, Number> data : dataSeries.getData()) {
            if (data.getNode() != null) {
                data.getNode().setStyle("-fx-bar-fill: #7DB18E;");
            }
        }


        // Thêm dữ liệu vào BarChart
        barChart.getData().add(dataSeries);
    }
}

