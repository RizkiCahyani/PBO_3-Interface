/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JalankanProgram;

import tugas3interface.Orang;
import tugas3interface.OrangMadura;
import tugas3interface.OrangSunda;

public class Menjalankan {

    public static void main(String[] args) {

        OrangSunda akangAsep = new OrangSunda();
        System.out.println("Akang Asep orang: " + akangAsep.getTempatTinggal());
        System.out.println("Akang Asep makan " + akangAsep.makan("sarapan"));
        System.out.println("========================================");
        
        OrangMadura Ahmad = new OrangMadura();
        System.out.println("Ahmad orang: " + Ahmad.getTempatTinggal());
        System.out.println("Ahmad golongan darahnya: " + Ahmad.getGolonganDarah());
        System.out.println("Ahmad berumur: " + Ahmad.getUmur());
        System.out.println("Ahmad kewarganegaraannya: " + Ahmad.getKewarganegaraan());
        System.out.println("Ahmad " + Ahmad.makan(20.00));
        Ahmad.tangkapIkan();
        Ahmad.jualIkan();
        Ahmad.jagaTambak();
        System.out.println("========================================");
        
        Orang rizki = new Orang();
        System.out.println("rizki orang:  " + rizki.getTempatTinggal());
        System.out.println("rizki " + rizki.makan());
    }
}
