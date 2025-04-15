/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.pertemuan.pkg601;

/**
 *
 * @author LAB F
 * TGL: 15 April 2025
 */
public class VolumeBalok {
   private int Panjang,Lebar,Tinggi;
   private int Hasil;
   
   public int Volume(){
       this.Hasil = this.Panjang*this.Lebar*this.Tinggi;
       return Hasil;
   }
   public void setPanjang (int pj){
       this.Panjang = pj;
   }
   public void setLebar (int lb){
       this.Lebar = lb;
   }
   public void setTinggi(int tg){
       this.Tinggi = tg;
   }
   public int getPanjang (){
       return this.Panjang; 
   }
   public int getLebar (){
       return this.Lebar;
   }
   public int getTinggi (){
       return this.Tinggi;
   }
}
