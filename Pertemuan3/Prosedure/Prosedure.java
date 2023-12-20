/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan3.Prosedure;

/**
 *
 * @author asus
 */
public class Prosedure {
    int alas = 10;
    int tinggi = 8;
    
    void hitungluasjajargenang(){
        int luas = alas*tinggi;
        System.out.println("Alas= "+ alas);
        System.out.println("Tinggi= "+tinggi);
        System.out.println("Luas jajargenjang = "+luas);
    }
    
    public static void main(String[] args) {
        Prosedure prosedure = new Prosedure();
        prosedure.hitungluasjajargenang();
    }
}
