package com.example.menu;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;

public class ControllerDetalle {
    @FXML
    public AnchorPane anchorpane;
    @FXML
    public Label nombreLabel;
    @FXML
    public Label emailLabel;
    @FXML
    public TextField nombreTF;
    @FXML
    public TextField emailTF;

    public Animation movimiento2;

    /*@FXML
    public void moverDetalle(){
        this.movimiento2= new Timeline(new KeyFrame(Duration.millis(17), lambda->{
            moverDetalleArriba();

        }));
        movimiento2.setCycleCount(Animation.INDEFINITE);
        movimiento2.play();
    }

    private void moverDetalleArriba() {

        //anchorpane.setTranslateY(anchorpane.getTranslateY()-2);
    }

     */
    @FXML
    public void moverDetalle(){
        anchorpane.setVisible(true);
    }

}