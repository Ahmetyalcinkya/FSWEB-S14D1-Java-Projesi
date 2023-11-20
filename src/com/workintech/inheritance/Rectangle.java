package com.workintech.inheritance;

public class Rectangle {

    private double width;

    private double length;

    private void checkWidthAndLength(double width, double length){
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
        if(length < 0){
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public Rectangle(double width, double length) {
        checkWidthAndLength(width, length);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width * length;
    }
}
