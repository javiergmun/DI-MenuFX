package com.example.menu;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private StringProperty name;
    private StringProperty email;
    private StringProperty dateOfBirth;
    private StringProperty address;
    private StringProperty telephoneNumber;
    private StringProperty password;
    private StringProperty image;

    public Person(){
        name = new SimpleStringProperty("...");
        email = new SimpleStringProperty("...");
        dateOfBirth = new SimpleStringProperty("...");
        address = new SimpleStringProperty("...");
        telephoneNumber = new SimpleStringProperty("...");
        password = new SimpleStringProperty("...");
        image = new SimpleStringProperty("...");
    }
    public Person(String nom, String eml, String dof, String adrs, String tlfNbr, String psw, String img) {
        name = new SimpleStringProperty("...");
        email = new SimpleStringProperty("...");
        dateOfBirth = new SimpleStringProperty("...");
        address = new SimpleStringProperty("...");
        telephoneNumber = new SimpleStringProperty("...");
        password = new SimpleStringProperty("...");
        image = new SimpleStringProperty("...");
    }

    }