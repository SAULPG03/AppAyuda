package com.example.appayuda;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class WebViewSample extends Application {
    private Scene scene;
    @Override
    public void start(Stage stage) {
        // create the scene
        stage.setTitle("Web View");
        scene = new Scene(new Browser(),750,500, Color.web("#666970"));
        stage.setScene(scene);
        scene.getStylesheets().add(WebViewSample.class.getResource("css/BrowserToolbar.css").toExternalForm());
        stage.show();
    }
    public static void main(String[] args){
        launch(args);
    }
}