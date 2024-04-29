package task3;

import java.util.ArrayList;
import java.util.List;

public class LMS {
    private List<Book> storage = new ArrayList<>();

    public void addBook(Book book) {
        storage.add(book);
    }

    public boolean removeBook(Book book) {
        return storage.remove(book);
    }

    public void printStorage() {
        if (storage.isEmpty()) {
            System.out.println("The storage is empty");
        } else {
            for (Book book : storage) {
                System.out.println("Title: " + book.getTitle());
                System.out.println("Composer: " + book.getComposer());
                System.out.println("Genre: " + book.getGenre());
                System.out.println("Difficulty Level: " + book.getDifficultyLevel());
                System.out.println("Music Link: " + book.getMusicLink());
                System.out.println();
            }
        }
    }
}

