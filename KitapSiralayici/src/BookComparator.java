import java.util.Comparator;

class BookComparator implements Comparator<Book> { // Comparator interface'ini uyguluyoruz
    // Sınıf compare metodunu tanımlıyoruz
    public int compare(Book b1, Book b2) {
        return b1.pages - b2.pages; // Kitapları sayfa sayılarına göre karşılaştırma yapıyoruz
    }
}