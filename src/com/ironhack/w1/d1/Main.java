package com.ironhack.w1.d1;

public class Main {
    public static void main(String[] args) {
        System.out.println("W1D1");

        // Comentarios en una linea

        /*
        Comentarios en bloque
        con varias lineas
         */

        // TipoDato nombreVar = valor;

        // Primitivas
        byte myByte = 127;
        short myShort = 1000;
        int myInt = 122200; // lo usaremos bastante
        long myLong = 500_000_000_000L;

        double myDouble = 3.456;
        float myFloat = 1.234f;

        boolean myBoolean = true;
        char myChar = '@';

        String myString = "Hola clase !!";

        int myNumber;

        myNumber = 233;

        System.out.println(myShort);

        String myName = "Sara";
        String welcomeMsg = "Bienvenida";

        System.out.println(welcomeMsg + " " + myName + "!");

        // Operadores logicos
        int number = 10;
        double doubleNumber = 10;


        System.out.println(number + 5);
        System.out.println(number + 5);
        System.out.println(number * 5);
        System.out.println(number / 3);
        System.out.println(doubleNumber / 3);
        System.out.println(number % 3);

        number++; // number = number + 1;
        number--;
        number += 3; // number = number + 3;
        number -= 3;
        number *= 3;
        number /= 3;
        System.out.println(number);

        number = ((number) + ((number * 4) / number)) * 14;

        // Condicionales
        number = 10;

        // <, >, <=, >=, ==, !=
        // &&, ||, ^

        if (number == 0) {
            System.out.println("Número es igual a 0");
            System.out.println("Que no es igual a 0 !!!");
        } else if (number >= 100 && number <= 1000) {
            System.out.println("El número es mayor que 100 y menor que 100");
        } else {
            System.out.println("Número es otro valor que no es 0");
        }

        if (number >= 10 || number <= -10) {
            System.out.println("El número tiene al menos dos dígitos");
        }

        if (number % 2 == 0) System.out.println("El número es par");
        else System.out.println("El número es impar");

        boolean myCondition = false;
        if (!myCondition) {
            System.out.println("Condición es falso");
        } else {
            System.out.println("Condición es verdadero");
        }

        // Switch
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3: {
                System.out.println("Miércoles");
                break;
            }
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("No entiendo el día !!");
                break;

        }

        switch (day) {
            case 1 -> {
                System.out.println("Método 2: " + "Lunes");
            }
            case 2 -> System.out.println("Método 2: " + "Martes");
            case 3 -> System.out.println("Método 2: " + "Miércoless");
            case 4 -> System.out.println("Método 2: " + "Jueves");
            case 5 -> System.out.println("Método 2: " + "Viernes");
            case 6 -> System.out.println("Método 2: " + "Sábado");
        }

        // Operador ternario
        double graden = 3.5;

//        String status;
//
//        if(graden >=5) {
//            status = "Aprobado";
//        }else{
//            status = "Suspenso";
//    }
//        String status = ((graden >= 5) ? "Aprobado" : "Suspenso");

        String status = ((graden >= 5)?"Aprobado":"Suspenso");
        System.out.println(status);

        myMethod();
        myMethod();

        System.out.println(getInfo(1));

        //Wrappers
        Integer myInteger = 100;
        System.out.println(myInteger);

        //Métodos de las cadenas de texto (String)
        String address = "Fake street, 123";

        System.out.println("Address: " + address);
        System.out.println("Address length:" + address.length());
        System.out.println(address.toUpperCase());
        System.out.println(address.toLowerCase());

        String address2 = "Fake street, 123";

        if(address.equals (address2)) System.out.println("Address are equals !!");

    }

    public static void myMethod(){
        System.out.println("\nEsto");
        System.out.println("está");
        System.out.println("dentro de");
        System.out.println("myMethod");
    }

    //modAcceso tipo tipoDevuelto nombreMétodo (tipo nombreparámetro, ...)
    public static String getInfo(int option){
        String output = "";

        if (option == 1) output = "Mi nombre es Sara";
        else if (option == 2) output = "Esto es un curso de Ironhack";
        else output = "La opción" + option + "no es válido";

        return output;

    }
}
