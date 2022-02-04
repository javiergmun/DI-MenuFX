package com.example.menu;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Locale localizacion = new Locale("en", "UK");
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.example.menu.i18n.strings", localizacion);
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("vistaPrincipal.fxml"),resourceBundle);

        Scene scene = new Scene(fxmlLoader.load(), 540, 350);
        stage.setTitle("Javier Gonzalez");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}