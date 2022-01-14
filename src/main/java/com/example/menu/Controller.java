package com.example.menu;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

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


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    public void vista1(){
        hbox1.setTranslateX(+2);

    }
    @FXML
    public void vista2(){
        hbox1.setTranslateX(+2);

    }
    @FXML
    public void vista3(){
        hbox1.setTranslateX(+2);

    }
    @FXML
    public void salir(){
        vbox1.setVisible(false);

    }
    @FXML
    public void menu(){
        vbox1.setVisible(true);

    }}