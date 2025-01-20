package org.example;

public class Calcul {

    public static float division(int a, int b) throws Exception {
        try {
            return (float)a/b;

        }catch (Exception ex){
            System.out.println(ex.getMessage());
            return 0;
        }
    }
}
