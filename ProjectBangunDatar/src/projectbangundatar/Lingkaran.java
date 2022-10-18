/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar;

/**
 *
 * @author user
 */
public class Lingkaran {
    // atribut
    
    int jejari;
    
    // methods
    
    void hitungLuas(){
        double hasil = 3.14 * jejari * jejari;
        System.out.println("Luas Lingkaran :" + hasil);
    }
    
    void hitungKeliling(){
        double hasil = 2 * 3.14 * jejari;
        System.out.println("Keliling Lingkaran :" + hasil);
    }
    
}
