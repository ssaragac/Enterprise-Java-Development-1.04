package com.ironhack.w1.d2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Week 1 Day 2");

        // Arrays (variable que puede contener muchas variables del mismo tipo)

        // tipo [] nombreArray = new tipo [tamaño]
        int[] arrayInt = new int[5];
//      int arrayInt2[] = new int[5]; <-- Antiguo, no usar

        System.out.println(arrayInt); // Esto muestra la posición de memoria

        // Guardar o modificar datos
        arrayInt[0] = 10;
        arrayInt[1] = 20;
        arrayInt[2] = 30;
        arrayInt[3] = 40;
        arrayInt[4] = 50;
        //arrayInt[5] = 60; <-- Daría error

        System.out.println(arrayInt[2]);

        //Esto define un array de 7 posiciones con sus valores asignados
        String[] days = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println(days);
        System.out.println(Arrays.toString(days));
        System.out.println(days[3]);
        System.out.println(days.length); // Longitud total del array
        System.out.println(days[days.length - 1]);

        String[] subjectArray = createSubjectArray();
        System.out.println(Arrays.toString(subjectArray));


        // BUCLES

        // for

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            // TODO: Código que ejecutaremos
            // FIXME: Hay que arreglar este problema
        }
        for (int i = 0; i < subjectArray.length; i++) {  //dara tantas vueltas como indices tenga el array
            System.out.println(subjectArray[i]);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        int[] evenNumbers = new int[51];
        int actIndex = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                evenNumbers[actIndex] = i;
                actIndex++;
            }
        }
        System.out.println(Arrays.toString(evenNumbers));

        for (int i = evenNumbers.length -1; i >= 0; i-- ){  //Contar hacia atras el array
            System.out.println(evenNumbers[i]);
        }

        // foreach
        for(String subject: subjectArray){
            System.out.println(subject);
        }

        // BUCLES WHILE - normalmente se usa para búsquedas
        int counter = 0;
        while(counter < 10){
            System.out.println("Counter:" + counter);
            counter++; // Condición de escape

        }
        System.out.println(counter);

        boolean founded = false;
        int subjectIndex = 0;
        while(!founded){
            if(subjectArray[subjectIndex].equals("Biología")){
                founded = true;
                System.out.println("Founded:" + subjectArray[subjectIndex] + " en el índice: " + subjectIndex);
            }

            subjectIndex++;
            if (subjectIndex == subjectArray.length){
                System.out.println("No encontrado");
                founded = true;
            }
        }

        // DO WHILE
        counter = 0;

        do {
            System.out.println("Contador:" + counter);
            counter++; // Condición de escape
        }while(counter < 10);

        // ArrayList
        List<String> countries = new ArrayList<>(); //Así se crea un Array list
        countries.add("USA");
        countries.add("Spain");
        countries.add("France");
        System.out.println(countries);
        System.out.println(countries.get(1));
        countries.set(2, "Italy");
        System.out.println(countries);
        System.out.println(countries.size()); //tamaño array list
        countries.remove(2);
        System.out.println(countries);

        for (int i = 0; i < countries.size(); i++) {
            System.out.println(countries.get(i)); //se muestran los dos en lineas separadas
        }


        // CLASE MATH & CASTING

        //Casting
        double mydouble = 4.25;
        int myInt = 5;

        myInt = (int) mydouble;

        System.out.println(myInt);

        //Math
        System.out.println(Math.sqrt(68));
        System.out.println(Math.random());
        System.out.println((int)Math.pow(2,5));
        System.out.println(Math.ceil(3.25));

    }

    private static String[] createSubjectArray() {
        String [] subjects = new String[5];
        subjects[0] = "Matemáticas";
        subjects[1] = "Lengua";
        subjects[2] = "Historia";
        subjects[3] = "Biología";
        subjects[4] = "Química";

        return subjects;
    }
}
