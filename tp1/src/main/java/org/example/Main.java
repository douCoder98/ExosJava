package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Visite v1 = new Visite();

        Visite v2 = new Visite("Abdou", "14/09/2023", 3);

        System.out.println(v1);

        System.out.println(v2);

        System.out.println(v2.convertDateUs());
    }
}