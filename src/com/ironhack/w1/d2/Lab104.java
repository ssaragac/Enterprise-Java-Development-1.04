package com.ironhack.w1.d2;

import java.util.Arrays;

public class Lab104 {
    public static void main(String[] args) {

        int[] arrResta = {7,2,10,4,1,6};
        Arrays.sort(arrResta);

        //TASK 1
        int difference = arrResta[arrResta.length - 1] - arrResta[0];
        System.out.println("Diferencia: " + difference);

        //TASK 2
        int menor = arrResta[0];
        int segundomenor = arrResta[1];
        System.out.println("Menor: " + menor);
        System.out.println("Segundo menor: " + segundomenor);

        //TASK 3
        int x = 3;
        int y = 10;

        double resultado = Math.pow(x, 2) + Math.pow((4*y/5)-x, 2);
        System.out.println("Resultado fórmula: " + resultado);

    }

}
