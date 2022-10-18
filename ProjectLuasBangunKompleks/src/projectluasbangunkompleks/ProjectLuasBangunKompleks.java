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
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("PROJECT 1");
        Lingkaran l = new Lingkaran(); 
        Persegi p = new Persegi();
        double persegiP1 = p.hitungLuas(42);
        double lingkaranP1 = l.hitungLuas(21);
        double totalSemua = lingkaranP1 + persegiP1;
        System.out.println("Total luas semua adalah " + totalSemua + " cm2");  
        
        System.out.println("PROJECT 2");
        double lingkaranBesarP2 = l.hitungLuas2(14);        
        double lingkaranKecil1P2 = l.hitungLuas2(7);        
        double lingkaranKecil2P2 = l.hitungLuas2(7);
        double totalSemua2 = (lingkaranBesarP2 - (lingkaranKecil1P2 + lingkaranKecil2P2 ));       
        System.out.println("Total luas semua adalah " + totalSemua2 + " cm2");  
    }
    
}
