package com.jshay.code_with_mosh.lectures.part1_2;

public class TextBox extends UIControl {
    private String text; //Field

    public void setText(String text){

        this.text = text;
    }

//    public TextBox() {
//        super(true);
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;
    }

    public void clear(){
        this.text = "";
    }
}
