import java.util.*;

class Book implements Comparable<Book> { // Comparable interface'inden kalıtım alıyoruz
    // Sınıf değişkenlerini tanımlıyoruz
    String name;
    int pages;
    String author;
    int year;

    // Sınıf kurucu metodunu tanımlıyoruz
    public Book(String name, int pages, String author, int year) {
        this.name = name;
        this.pages = pages;
        this.author = author;
        this.year = year;
    }

    // Sınıf toString metodunu tanımlıyoruz
    public String toString() {
        return name + " (" + pages + " sayfa) - " + author + " (" + year + ")";
    }

    // Sınıf compareTo metodunu tanımlıyoruz
    public int compareTo(Book b) {
        return this.name.compareTo(b.name); // Kitap isimlerine göre karşılaştırma yapıyoruz
    }
}