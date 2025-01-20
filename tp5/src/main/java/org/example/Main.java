package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Wind wind = new Wind();
        WoodWind woodWind = new WoodWind();
        Percusision percusision = new Percusision();

        System.out.println("Wind :");
        wind.play();
        System.out.println("WoodWind :");
        woodWind.play();
        System.out.println("Percussion :");
        percusision.play();
    }
}