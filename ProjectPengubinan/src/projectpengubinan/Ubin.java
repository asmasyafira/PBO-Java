/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpengubinan;

/**
 *
 * @author user
 */
public class Ubin {
    // panjang ubin
    int panjang;
    // lebar ubin
    int lebar;
        
    // menghitung luas sebuah ubin
    int hitungLuas(int x, int y){
        // menghitung luas dengan memanfaatkan class persegi panjang
        PersegiPanjang p = new PersegiPanjang();
        
        // panjang dari persegi panjang diambil dari panjang ruang
//        p.panjang = this.panjang;
        // lebar dari persegi panjang diambil dari lebar ruang
//        p.lebar = this.lebar;
        
        // hitung luasnya
        return p.hitungLuas(this.panjang, this.lebar);

    }
}
