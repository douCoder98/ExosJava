package org.example;
import tools.MesDates;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(MesDates.dateFRtoUS("12/09/2019"));
        System.out.println((MesDates.dateUStoFR("12/23/2018")));
    }
}