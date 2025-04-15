/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.pertemuan.pkg601;

import java.util.Scanner;

/**
 *
 * @author LAB F
 * TGL: 15 APRIL 2025
 */
public class OopPertemuan601 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       VolumeBalok vb = new VolumeBalok();
       Scanner inp = new Scanner (System.in);
       
       System.out.println("Hitung Volume Balok");
       System.out.print("Nilai Panjang: ");
       vb.setPanjang(inp.nextInt());
       System.out.print("Nilai Lebar: ");
       vb.setLebar(inp.nextInt());
       System.out.print("Nilai Tinggi: ");
       vb.setTinggi(inp.nextInt());
       System.out.println("Nilai Volume: ");
       System.out.println("V = P * L * T");
       System.out.printf(" = %d * %d * %d\n",vb.getPanjang(),vb.getLebar(),vb.getTinggi());
       System.out.printf(" = %d",vb.Volume());
       
    }
    
}
