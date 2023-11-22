/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

/**
 *
 * @author LAB 1-17
 */
public class Siswa {
static int   nisn;
static int nis	;
static String nama;	
static String  id_kelas;
static String  alamat	;
static String  no_telp;
static int  id_spp;

    public static int getNisn() {
        return nisn;
    }

    public static void setNisn(int nisn) {
        Siswa.nisn = nisn;
    }

    public static int getNis() {
        return nis;
    }

    public static void setNis(int nis) {
        Siswa.nis = nis;
    }

    public static String getNama() {
        return nama;
    }

    public static void setNama(String nama) {
        Siswa.nama = nama;
    }

    public static String getId_kelas() {
        return id_kelas;
    }

    public static void setId_kelas(String id_kelas) {
        Siswa.id_kelas = id_kelas;
    }

    public static String getAlamat() {
        return alamat;
    }

    public static void setAlamat(String alamat) {
        Siswa.alamat = alamat;
    }

    public static String getNo_telp() {
        return no_telp;
    }

    public static void setNo_telp(String no_telp) {
        Siswa.no_telp = no_telp;
    }

    public static int getId_spp() {
        return id_spp;
    }

    public static void setId_spp(int id_spp) {
        Siswa.id_spp = id_spp;
    }


}
