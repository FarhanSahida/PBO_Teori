/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul10;

/**
 *
 * @author Ideapad 3 14ITL6
 */
public class BukuAlamat {
    private EntryBukuAlamat[] daftarEntry;
    private int jumlahEntry;

    // Constructor
    public BukuAlamat() {
        daftarEntry = new EntryBukuAlamat[100];
        jumlahEntry = 0;
    }

    // Method untuk memasukkan data
    public void tambahEntry(EntryBukuAlamat entry) {
        if (jumlahEntry < 100) {
            daftarEntry[jumlahEntry] = entry;
            jumlahEntry++;
        } else {
            System.out.println("Buku alamat penuh!");
        }
    }

    // Method untuk menghapus data
    public void hapusEntry(int index) {
        if (index >= 0 && index < jumlahEntry) {
            for (int i = index; i < jumlahEntry - 1; i++) {
                daftarEntry[i] = daftarEntry[i + 1];
            }
            daftarEntry[jumlahEntry - 1] = null;
            jumlahEntry--;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    // Method untuk menampilkan seluruh data
    public void tampilkanDaftar() {
        for (int i = 0; i < jumlahEntry; i++) {
            System.out.println("==============================");
            System.out.println("Data ke-" + (i+1));
            System.out.println("Nama: " + daftarEntry[i].getNama());
            System.out.println("Alamat: " + daftarEntry[i].getAlamat());
            System.out.println("Nomor Telepon: " + daftarEntry[i].getNomorTelepon());
            System.out.println("Alamat Email: " + daftarEntry[i].getAlamatEmail());
            System.out.println("==============================");
        }
    }

    // Method untuk update data
    public void updateEntry(int index, EntryBukuAlamat entry) {
        if (index >= 0 && index < jumlahEntry) {
            daftarEntry[index] = entry;
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    void tambahEntry() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNama(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setAlamat(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setNotelp(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setEmail(String readLine) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getAlamat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNotelp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

