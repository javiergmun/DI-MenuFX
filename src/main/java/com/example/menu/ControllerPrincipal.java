package com.example.menu;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class ControllerPrincipal {
    @FXML
    public Button vistaPersona1;
    @FXML
    public Button vistaPersona2;
    @FXML
    public Button vistaPersona3;
    @FXML
    public Button botonSalir;
    @FXML
    public Button botonMenu;
    @FXML
    public VBox vbox1;
    @FXML
    public StackPane stackpane1;
    @FXML
    public ImageView imagenLogo;
    @FXML
    public ImageView photo;
    @FXML
    public Rectangle rectanguloLimiteDcha;
    @FXML
    public Rectangle rectanguloLimiteIzda;
    private Animation movimiento1;
    @FXML
    public ControllerDetalle controllerDetalle;

    @FXML
    public void vista1(){
        //insertar vista 1
        photo.setImage(new Image("https://www.theportlandclinic.com/wp-content/uploads/2019/07/Person-Curtis_4x5-e1564616444404-300x300.jpg"));
    }
    @FXML
    public void vista2(){
        //insertar vista 2
        photo.setImage(new Image("https://architecture.ou.edu/wp-content/uploads/2018/07/ANGELAPERSON-1447-300x300.jpg"));
    }
    @FXML
    public void vista3(){
        //insertar vista 3
        photo.setImage(new Image("https://www.lse.ac.uk/international-relations/assets/images/people-pages/PSS/sherwood-andrew-300x300.jpg"));
    }
    @FXML
    public void salir(){
        imagenLogo.setTranslateY(0);
        botonMenu.setTranslateY(0);
        vbox1.setTranslateX(0);
        stackpane1.setTranslateX(0);
    }
    @FXML
    public void detalle(){
        controllerDetalle.moverDetalle();
    }
    //ANIMACIÓN DISEÑADA PARA CUALQUIER BOTON, SOLO CAMBIAR EL TRANSLATE Y EL LIMITE CON EL QUE CHOCA :)
    @FXML
    public void menu(){
        this.movimiento1=new Timeline((new KeyFrame(Duration.millis(17), lambda->{
            iniciarMovimientoMenu();
            pararMovimientoMenu();
        })));
        movimiento1.setCycleCount(Animation.INDEFINITE);
        movimiento1.play();
        //imagenLogo.setVisible(false);
    }
    public void iniciarMovimientoMenu(){
        botonMenu.setTranslateY(botonMenu.getTranslateY()-3);
        vbox1.setTranslateX(vbox1.getTranslateX()+7);
        stackpane1.setTranslateX(stackpane1.getTranslateX()+3);
        imagenLogo.setTranslateY(imagenLogo.getTranslateY()+20);
    }
    public void pararMovimientoMenu() {
        if (stackpane1.getBoundsInParent().intersects(rectanguloLimiteDcha.getBoundsInParent())) {
            movimiento1.stop();
        }
    }


}