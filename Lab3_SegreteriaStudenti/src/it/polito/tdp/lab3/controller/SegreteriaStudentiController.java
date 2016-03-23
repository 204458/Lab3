package it.polito.tdp.lab3.controller;

import java.net.URL;
import java.util.ResourceBundle;

import it.polito.TdP.model.RubricaModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SegreteriaStudentiController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField lblMatricola;

    @FXML
    private Button btnCompleta;

    @FXML
    private TextField lblNome;

    @FXML
    private TextField lblCognome;

    @FXML
    private Button btnCerca;

    @FXML
    private Button btnIscriviti;

    @FXML
    private Button btnReset;

    @FXML
    void doCerca(ActionEvent event) {

    }

    @FXML
    void doCompleta(ActionEvent event) {
    	String matricola = lblMatricola.getText();
    	
    }

    @FXML
    void doIscriviti(ActionEvent event) {

    }

    @FXML
    void doReset(ActionEvent event) {

    }
    
    public void setModel(RubricaModel model){
    	this.model=model;

    @FXML
    void initialize() {
        assert lblMatricola != null : "fx:id=\"lblMatricola\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnCompleta != null : "fx:id=\"btnCompleta\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert lblNome != null : "fx:id=\"lblNome\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert lblCognome != null : "fx:id=\"lblCognome\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnCerca != null : "fx:id=\"btnCerca\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnIscriviti != null : "fx:id=\"btnIscriviti\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";

    }
}