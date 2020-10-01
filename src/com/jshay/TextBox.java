package com.jshay;

public class TextBox extends UIControl {
    private String text; //Field

    public void setText(String text){

        this.text = text;
    }

    public TextBox() {
        super(true);
        System.out.println("TextBox");

    }

    public void clear(){

        this.text = "";
    }
}
