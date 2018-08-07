/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.BadSmell;

import java.util.ArrayList;

/**
 *
 * @author josea
 */
public class Peliculas {

    private ArrayList<Integer> puntos;


    public ArrayList<Integer> top3() {
        ArrayList<Integer> top3 = new ArrayList<>();
        ArrayList<Integer> copia = new ArrayList<>(puntos);
        for (int i = 0; i < 3; i++) {
            int max = 0;
            for (int j = 0; j< puntos.size(); j++) {
                if (max < puntos.get(j)) {
                    max = puntos.get(j);
                }
            }
            top3.add(max);
            copia.remove(copia.indexOf(max));
        }
        return top3;
    }


    public void sumaTotalyTop10() {
        ArrayList<Integer> copia = new ArrayList<>(puntos);
        int total = 0;
        for (int i = 0; i < 10; i++) {
            int max = 0;
            for (int j = 0; j< puntos.size(); j++) {
                if (max < puntos.get(j)) {
                    max = puntos.get(j);
                }
            }
            total += max;
            System.out.println(i + 1 + ". " + max);
            copia.remove(copia.indexOf(max));
        }
        System.out.println("Total: " + total);
    }
}
