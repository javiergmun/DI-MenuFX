package com.example.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("vistaPrincipal.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 500, 350);
        stage.setTitle("¡Pinta el circulo según la vista que elijas!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}