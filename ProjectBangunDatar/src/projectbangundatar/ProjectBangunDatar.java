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
public class ProjectBangunDatar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat obyek persegi panjang A
        PersegiPanjang A = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari A
        A.panjang = 10;
        A.lebar = 7;
        
        // menghitung luas dan keliling dari A
        A.hitungLuas();
        A.hitungKeliling();
        
        // membuat obyek persegi panjang A
        PersegiPanjang B = new PersegiPanjang();
        
         // memberi nilai atribut panjang & lebar dari B
        B.panjang = 14;
        B.lebar = 9;
        
        // menghitung luas dan keliling dari B
        B.hitungLuas();
        B.hitungKeliling();
        
        //membuat obyek persegi panjang C dan D
        PersegiPanjang C = new PersegiPanjang();
        PersegiPanjang D = new PersegiPanjang();
        
        // memberi nilai atribut panjang & lebar dari C dan D
        C.panjang = 17;
        C.lebar = 8;
        D.panjang = 26;
        D.lebar = 14;
        
         // menghitung luas dan keliling dari C dan D
        C.hitungLuas();
        C.hitungKeliling();
        D.hitungLuas();
        D.hitungKeliling();
        
        // membuat obyek lingkaran L1 dan L2
        Lingkaran L1 = new Lingkaran();
        Lingkaran L2 = new Lingkaran();
        
        // memberi nilai atribut jejari dari L1 dan L2
        L1.jejari = 6;
        L2.jejari = 12;
        
        // menghitung luas dan keliling dari L1 dan L2
        L1.hitungLuas();
        L1.hitungKeliling();
        L2.hitungLuas();
        L2.hitungKeliling();
        
    }
    
}
