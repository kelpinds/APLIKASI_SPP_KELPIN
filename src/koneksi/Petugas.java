/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import FORM.petugas;

/**
 *
 * @author LAB 1-17
 */
public class Petugas {

    static int Id_petugas;
    static String Username;
    static String Password;
    static String Nama_petugas;
    static String Level;

    public static int getId_petugas() {
        return Id_petugas;
    }

    public static void setId_petugas(int Id_petugas) {
        Petugas.Id_petugas = Id_petugas;
    }

    public static String getUsername() {
        return Username;
    }

    public static void setUsername(String Username) {
        Petugas.Username = Username;
    }

    public static String getPassword() {
        return Password;
    }

    public static void setPassword(String Password) {
        Petugas.Password = Password;
    }

    public static String getNama_petugas() {
        return Nama_petugas;
    }

    public static void setNama_petugas(String Nama_petugas) {
        Petugas.Nama_petugas = Nama_petugas;
    }

    public static String getLevel() {
        return Level;
    }

    public static void setLevel(String Level) {
        Petugas.Level = Level;
    }

   
}

