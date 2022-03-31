/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1dpbo2022;

/**
 *
 * @author acer
 */
public class Author {
    // attribute
    private int id;
    private String img;
    private String nama;
    private int jumlah_buku;
    
    // constructor
    public Author() {
    }
    
    // overloading class constructor
    public Author(int id, String img, String nama, int jumlah_buku) {
        this.id = id;
        this.img = img;
        this.nama = nama;
        this.jumlah_buku = jumlah_buku;
    }
    
    // setter and getter
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return this.id;
    }
    
    public void setImg(String img) {
        this.img = img;
    }
    
    public String getImg() {
        return this.img;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public void setJumlahBuku(int jumlah_buku) {
        this.jumlah_buku = jumlah_buku;
    }
    
    public int getJumlahBuku() {
        return this.jumlah_buku;
    }
}
