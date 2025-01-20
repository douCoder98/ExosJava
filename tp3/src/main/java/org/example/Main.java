package org.example;

import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Visite v1 = new Visite("Abdou", "12/09/2023", 3);
        Visite v2 = new Visite("Doudou", "12/09/2023", 3);
        Visite v3 = new Visite("Jean", "12/09/2023", 3);
        Visite v4 = new Visite("Mark", "12/09/2023", 3);

        Planning planning = new Planning(new ArrayList<>(Arrays.asList(v1, v2, v3)));

        planning.addVisite(v4);

        planning.deleteVisite("Abdou");

        System.out.println(planning.getVisites());
    }
}