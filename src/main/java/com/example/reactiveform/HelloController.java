package com.example.reactiveform;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextField mytext;
    @FXML
    Label repeatText;


    @FXML
    private TextField txtVal;



    Model model= new Model("");



    @FXML
    void updateText(){
        model.setName(mytext.getText());
      //  repeatText.setText(model.getName());
    }

    @FXML
    void addStar(ActionEvent event) {
        model.addStar();
     //   mytext.setText(model.getName());
     //   repeatText.setText(model.getName());
    }

    @FXML
    void delLeft(ActionEvent event) {
        model.delLeft();
     //   mytext.setText(model.getName());
     //   repeatText.setText(model.getName());
    }
    @FXML
    void clearText(){
        model.setName("");
     //   mytext.setText("");
     //   repeatText.setText("");
    }

    public void refreshName()
    {
        mytext.setText(model.getName());
        repeatText.setText(model.getName());
    }

    public void initialize(){
        model.name.addListener(observable -> refreshName());
        model.value.addListener(observable -> txtVal.setText(String.valueOf(model.getValue())));

    }

    @FXML
    void decr(ActionEvent event) {
        model.decrement();
    }

    @FXML
    void incr(ActionEvent event) {
        model.increment();
    }

    @FXML
    void updateVal(ActionEvent event) {
        model.setValue(Integer.parseInt(txtVal.getText()));
    }

}
