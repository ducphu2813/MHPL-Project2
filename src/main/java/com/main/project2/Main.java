package com.main.project2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
    public void start(Stage primaryStage) {
        try {	
			Parent root = FXMLLoader.load(getClass().getResource("MainFrame.fxml"));
			Scene scene = new Scene(root);
			
//			Image icon = new Image(getClass().getResourceAsStream("hello.png")); // Sửa đường dẫn của hình ảnh
//		    primaryStage.getIcons().add(icon);

			primaryStage.setResizable(false);
		    primaryStage.setTitle("Quản lý thiết bị");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
