package com.example.ggz.builder.demo;

public abstract class Computer {
    protected String mBoard;
    protected String mDisplay;
    protected String mOS;

    protected Computer() {
    }

    public void setBoard(String board) {
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOS();

    @Override
    public String toString() {
        return "Computer :\nmBoard = " + mBoard + "\nmDisplay = " + mDisplay + "\nmOS = " + mOS;
    }
}
