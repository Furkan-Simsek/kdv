package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double tutar, kdvOran = 0.18;
        double kdvliTutar, kdvTutar;
        Scanner inp = new Scanner(System.in);
        System.out.print("Ücret tutarını girin: ");
        tutar = inp.nextDouble();
        if (tutar >= 1000){
            kdvTutar = tutar * 0.08;
            kdvliTutar = tutar + kdvTutar;
        }else{
            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;
        };
        System.out.println(kdvliTutar);
    }
}
