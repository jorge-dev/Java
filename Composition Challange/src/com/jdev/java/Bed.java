package com.jdev.java;

public class Bed {

    private String style;
    private int height, pillows, sheets,quilt;



    public Bed(String style, int height, int pillows, int sheets, int quilt) {
        this.style = style;
        this.height = height;
        this.pillows = pillows;
        this.sheets = sheets;
        this.quilt = quilt;
    }
    public String getStyle() {
        return style;
    }

    public int getHeight() {
        return height;
    }

    public int getPillows() {
        return pillows;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }

    public void make(){
        System.out.println("Bed -> Making");
    }
}
