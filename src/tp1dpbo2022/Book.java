/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp1dpbo2022;

/**
 *
 * @author acer
 */
public class Book {
    // attribute
    private int id;
    private String img;
    private String penerbit;
    private String author;
    private String deskripsi;
    
    // constructor
    public Book() {
    }
    
    // overloading constructor
    public Book(int id, String img, String penerbit, String author, String deskripsi) {
        this.id = id;
        this.img = img;
        this.penerbit = penerbit;
        this.author = author;
        this.deskripsi = deskripsi;
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
    
    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public String getPenerbit() {
        return this.penerbit;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getAuthor() {
        return this.author;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }
    
    public String getDeskripsi() {
        return this.deskripsi;
    }
}
