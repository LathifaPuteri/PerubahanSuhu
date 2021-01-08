/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perubahansuhu;

/**
 *
 * @author MOKLET-2
 */
public class PerubahanSuhu {
//mendeklarasikan variabel
int celcius = 78;
int reamur;
int farenhit;
int kelvin;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //membuat objek baru
        PerubahanSuhu suhu = new PerubahanSuhu();
        
        //rumus perubahan suhu farenhit
        suhu.farenhit = (suhu.celcius*9/5)+32;
        System.out.println("Perubahan Suhu Celcius ke Farenhit = "+suhu.farenhit);
        
        //rumus perubahan suhu reamur
        suhu.reamur = (suhu.celcius*4/5);
        System.out.println("Perubahan Suhu Celcius ke Reamur = "+suhu.reamur);
        
        //rumus perubahan suhu kelvin
        suhu.kelvin = suhu.celcius+273;
        System.out.println("Perubahan Suhu Celcius ke Kelvin = "+suhu.kelvin);
    }
    
}
