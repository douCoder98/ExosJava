package org.example;

public class Percusision implements Instrument{
    @Override
    public void play() {
        System.out.println("Poum");
    }

    @Override
    public String what() {
        return "";
    }

    @Override
    public void adjust() {

    }
}
