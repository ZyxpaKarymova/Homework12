package sky.pro;

public class App {
    public static void main(String[] args) {
        Author Nabokov = new Author("Vladimir", "Nabokov");
        Author Dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book Lolita = new Book("Lolita", Nabokov, 1955);
        Book Idiot = new Book("Idiot", Dostoevsky, 1868);

        System.out.println(Lolita.publishYear);
        Lolita.setPublishYear(1956);
        System.out.println(Lolita.publishYear);

    }


}
