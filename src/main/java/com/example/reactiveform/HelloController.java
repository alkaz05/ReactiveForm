package com.example.reactiveform;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;

import java.text.DecimalFormat;

public class HelloController {

    @FXML
    TextField mytext;
    @FXML
    Label repeatText;


    @FXML
    private TextField txtVal;

    @FXML
    Slider sliderVal;



    Model model= new Model("");



    @FXML
    void updateText(){
       // model.setName(mytext.getText());
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

   // public void refreshName()
   // {
        //mytext.setText(model.getName());
        //repeatText.setText(model.getName());
   // }

    public void initialize(){
        //model.name.addListener(observable -> refreshName());
       // model.value.addListener(observable -> txtVal.setText(String.valueOf(model.getValue())));

        model.name.bindBidirectional(mytext.textProperty());
        model.name.bindBidirectional(repeatText.textProperty());

        //model.value.bindBidirectional(txtVal.layoutXProperty());
        txtVal.textProperty().bindBidirectional(model.valueProperty(), new DecimalFormat());
        sliderVal.valueProperty().bindBidirectional(model.valueProperty());
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
       // model.setValue(Integer.parseInt(txtVal.getText()));
    }

}
