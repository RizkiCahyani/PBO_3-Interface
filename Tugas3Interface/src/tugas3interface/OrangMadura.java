/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3interface;


public class OrangMadura extends Orang implements Nelayan, PenjualIkan, BudidayaTambak {

    @Override
    public void tangkapIkan() {
        System.out.println("Saya menangkap banyak ikan");
    }

    @Override
    public void jualIkan() {
        System.out.println("saya menjual ikan segar");
    }

    @Override
    public void jagaTambak() {
        System.out.println("saya sedang jaga tambak");
    }

    public void settempatTinggal() {
        super.setTempatTinggal("Madura");
    }

    public void setgolonganDarah() {
        super.setGolonganDarah("A");
    }

    public void setumur() {
        super.setUmur("35");
    }

    public void setkewarganegaraan() {
        super.setKewarganegaraan("Indonesia");
    }

    public OrangMadura() {
        this.setTempatTinggal("Madura");
        this.setGolonganDarah("A");
        this.setUmur("30");
        this.setKewarganegaraan("Indonesia");

    }

}
