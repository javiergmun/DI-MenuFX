package com.example.menu;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class ControllerPrincipal {
    @FXML
    public Button vista1;
    public Button vista2;
    public Button vista3;
    public Button salir;
    public Button Menu;
    public HBox hbox1;
    public VBox vbox1;
    public StackPane stackpane1;
    public ImageView imagenLogo;
    public ImageView photo;

    @FXML
    public void vista1(){
        photo.setImage(new Image("https://www.theportlandclinic.com/wp-content/uploads/2019/07/Person-Curtis_4x5-e1564616444404-300x300.jpg"));
    }
    @FXML
    public void vista2(){
        photo.setImage(new Image("https://architecture.ou.edu/wp-content/uploads/2018/07/ANGELAPERSON-1447-300x300.jpg"));
    }
    @FXML
    public void vista3(){
        photo.setImage(new Image("https://www.lse.ac.uk/international-relations/assets/images/people-pages/PSS/sherwood-andrew-300x300.jpg"));
    }
    @FXML
    public void salir(){
        Menu.setTranslateX(0);
        photo.setImage(new Image("https://www.seekpng.com/png/small/87-872219_lupa-icon.png"));
        imagenLogo.setVisible(true);
        vbox1.setTranslateX(-75);
        stackpane1.setTranslateX(0);
        hbox1.setVisible(true);

    }
    @FXML
    public void menu(){
        Menu.setTranslateX(100);
        vbox1.setTranslateX(75);
        stackpane1.setTranslateX(20);
        imagenLogo.setVisible(false);
        hbox1.setVisible(false);
    }

    public void cargarDetalle(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(ControllerPrincipal.class.getResource("vistaCargarDetalles.fxml"));


    }
}