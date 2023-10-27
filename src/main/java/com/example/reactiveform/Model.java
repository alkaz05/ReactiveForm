package com.example.reactiveform;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Model {
    SimpleStringProperty name;
    SimpleIntegerProperty value = new SimpleIntegerProperty();

    public Model(String name) {
        this.name = new SimpleStringProperty(name);
    }

    public void addStar()
    {
        String s = name.get();
        s+="*";
        name.set(s);
    }

    public void delLeft()
    {
        if(!name.get().isEmpty())
        {
            String s = name.get();
            s = s.substring(1);
            name.set(s);
        }
    }

    public String getName() {
        return name.get();
    }

    public SimpleStringProperty nameProperty() {
        return name;
    }

    public void setName(String name) {
        this.name.set(name);
    }

    public int getValue() {
        return value.get();
    }

    public SimpleIntegerProperty valueProperty() {
        return value;
    }

    public void setValue(int value) {
        this.value.set(value);
    }

    public void increment()
    {
        value.set(1+value.get());
    }

    public void decrement()
    {
        value.set(-1+value.get());
    }
}
