package com.example.menu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    private Label welcomeText;
    public Button vista1;
    public Button vista2;
    public Button vista3;
    public Button salir;
    public Button Menu;
    public HBox hbox1;
    public VBox vbox1;
    public StackPane stackpane1;
    public Circle circulo;

    @FXML
    public void vista1(){
        circulo.setFill(Color.RED);
    }
    @FXML
    public void vista2(){
        circulo.setFill(Color.GREEN);
    }
    @FXML
    public void vista3(){
        circulo.setFill(Color.BLUE);
    }
    @FXML
    public void salir(){
        Menu.setTranslateX(0);
        vbox1.setTranslateX(-62);
        stackpane1.setTranslateX(0);
        hbox1.setVisible(true);
    }
    @FXML
    public void menu(){
        Menu.setTranslateX(100);
        vbox1.setTranslateX(62);
        stackpane1.setTranslateX(20);
        hbox1.setVisible(false);
    }
}