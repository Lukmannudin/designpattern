package com.lukmannudin;

public class Box {

    private int length;
    private int width;
    private int height;

    Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getVolume() {
        return length * width * height;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

}
