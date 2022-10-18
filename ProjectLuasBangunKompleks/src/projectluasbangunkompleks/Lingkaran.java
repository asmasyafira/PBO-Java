/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author user
 */
public class Lingkaran {
    
    double hitungLuas(double jejari){
        double luasLingkaran;
        luasLingkaran = (((3.14 * jejari * jejari)/2)*4) ;
        System.out.println("Luas Lingkaran adalah " + luasLingkaran + " cm2");
        return luasLingkaran;
    }
    
    double hitungLuas2(double jejari){
        double luasLingkaran;
        luasLingkaran = ((3.14 * jejari * jejari)/2) ;
        System.out.println("Luas Lingkaran 2 adalah " + luasLingkaran + " cm2");
        return luasLingkaran;
    }
}
