/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3interface;

public class Orang {

    public Orang() {
        this.tempatTinggal = "pribumi";
        this.golonganDarah = "rahasia";
        this.umur = "30 tahun keatas";
        this.kewarganegaraan = "Indonesia";

    }

    private String tempatTinggal;
    private String golonganDarah;
    private String umur;
    private String kewarganegaraan;

    public String getTempatTinggal() {
        return tempatTinggal;
    }

    public void setTempatTinggal(String tempatTinggal) {
        this.tempatTinggal = tempatTinggal;
    }

    public String getGolonganDarah() {
        return golonganDarah;
    }

    public void setGolonganDarah(String golonganDarah) {
        this.golonganDarah = golonganDarah;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getKewarganegaraan() {
        return kewarganegaraan;
    }

    public void setKewarganegaraan(String kewarganegaraan) {
        this.kewarganegaraan = kewarganegaraan;
    }

    public String makan() {
        return "makan tepat waktu";
    }

    public String makan(String waktu) {
        return "nasi saat " + waktu;
    }

    public String makan(int waktu) {
        return "makan siang tepat waktu " + String.valueOf(waktu);
    }

    public String makan(double waktu) {
        return "makan malam telat banget jam " + String.valueOf(waktu);
    }
}
