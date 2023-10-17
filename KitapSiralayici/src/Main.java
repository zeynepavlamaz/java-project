import java.util.*;

public class Main {
    public static void main(String[] args) {
        // beş tane nesne oluşturuyoruz
        Book b1 = new Book("Nietzsche Ağladığında", 416, "Irvin D. Yalom", 1992);
        Book b2 = new Book("NUTUK", 658, "Mustafa Kemal Atatürk", 1927);
        Book b3 = new Book("Suç ve Ceza", 720, "Fyodor Dostoyevski", 1866);
        Book b4 = new Book("Küçük Prens", 96, "Antoine de Saint-Exupéry", 1943);
        Book b5 = new Book("İçimizdeki Şeytan", 304, "Sabahattin Ali", 1940);

        // Kitapları HashSet içinde saklıyoruz
        HashSet<Book> books = new HashSet<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        // Kitapları ekrana yazdırıyoruz
        System.out.println("HashSet ile kitaplar:");
        for (Book b : books) {
            System.out.println(b);
        }

        // Kitapları sayfa sayısına göre sıralamak için TreeSet kullanıyoruz
        TreeSet<Book> sortedBooks = new TreeSet<>(new BookComparator()); // BookComparator sınıfından bir nesne oluşturup parametre olarak veriyoruz

        // Kitapları TreeSet'e ekliyoruz
        sortedBooks.addAll(books);

        // Kitapları ekrana yazdırıyoruz
        System.out.println("TreeSet ile kitaplar:");
        for (Book b : sortedBooks) {
            System.out.println(b);
        }
    }
}
