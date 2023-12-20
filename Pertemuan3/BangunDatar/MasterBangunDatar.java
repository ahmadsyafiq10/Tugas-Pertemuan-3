/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.BangunDatar;

/**
 *
 * @author asus
 */
public class MasterBangunDatar {
   
    void hitungluasjajargenjang (int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        System.out.println("Luas jajargenjang = "+luas);
    }
    
    int luasjajargenjang (int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        return luas;
    }
    
    static void menghitungluasjajargenjang (int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        System.out.println("Luas jajargenjang = "+luas);
    }
    
    static int perhitunganluasjajargenjang (int alas, int tinggi){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        return luas;
    }
}
