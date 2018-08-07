/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DuplicateCode.Refactorizado;

import java.util.ArrayList;

/**
 *
 * @author josea
 */
public class Peliculas {

    private ArrayList<Integer> puntos;

    public int maximo(ArrayList<Integer> lista) {
        int max = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (max < puntos.get(i)) {
                max = puntos.get(i);
            }
        }
        return max;
    }

    public ArrayList<Integer> listaTop3() {
        ArrayList<Integer> top3 = new ArrayList<>();
        ArrayList<Integer> copia = new ArrayList<>(puntos);
        int max = 0;
        for (int i = 0; i < 3; i++) {
            max = maximo(copia);
            top3.add(max);
            copia.remove(copia.indexOf(max));
        }
        return top3;
    }

    public void sumaTotalyTop10() {
        ArrayList<Integer> copia = new ArrayList<>(puntos);
        int max = 0;
        int total = 0;
        for (int i = 0; i < 10; i++) {
            max = maximo(copia);
            total += max;
            System.out.println(i + 1 + ". " + max);
            copia.remove(copia.indexOf(max));
        }
        System.out.println("Total: " + total);
    }
}
