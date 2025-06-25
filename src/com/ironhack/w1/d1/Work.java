package com.ironhack.w1.d1;

public class Work {
    public static void main(String[] args) {
       String MsgBienvenida = "Feliz Mieércoles";
        String myName = "Sara";
       String mySurname = "Garin";
        int myInt = 32;

        System.out.println(MsgBienvenida + " " + myName + " " + mySurname + ", " + "tienes" +" " + myInt + " " + "años");

        if (myInt >= 30){
            System.out.println("El tiempo pasa");
    }else{
            System.out.println("Eres muy joven!!"); }
}
}