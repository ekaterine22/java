package task3;

public class LibraryTester {
    public static void main(String[] args) {
        Book b1 = new Book("Moonlight Sonata", "Ludwig van Beethoven", "Classical", 3, "moonlight_sonata.mid");
        Book b2 = new Book("River Flows in You", "Yiruma", "Contemporary", 2, "river_flows_in_you.mid");

        LMS lms = new LMS();
        lms.addBook(b1);
        lms.addBook(b2);

        System.out.println("Piano Melodies Library:");
        lms.printStorage();

        lms.removeBook(b1);
        System.out.println("After removing Moonlight Sonata:");
        lms.printStorage();
    }
}
