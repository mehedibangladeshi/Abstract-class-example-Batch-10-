package com.sdmagp.iiuc.example;

public class Main {

    public static void main(String[] args) {

       Human rattre = new Rattre();
       Human onu = new Human() {
           @Override
           void works() {
         System.out.println(" Clean ");
           }
       };

       rattre.sleeps();
       rattre.works();

       onu.sleeps();
       onu.works();





    }
}
