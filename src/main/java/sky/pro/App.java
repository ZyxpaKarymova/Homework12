package sky.pro;

public class App {
    public static void main(String[] args) {
        Author Nabokov = new Author("Vladimir", "Nabokov");
        Author Nabokov2 = new Author("Vladimir", "Nabokov");
        Author Dostoevsky = new Author("Fyodor", "Dostoevsky");
        Book Lolita = new Book("Lolita", Nabokov, 1955);
        Book Idiot = new Book("Idiot", Dostoevsky, 1868);

        System.out.println("Nabokov = " + Nabokov);
        System.out.println("Dostoevsky = " + Dostoevsky);
        System.out.println("Lolita = " + Lolita);
        System.out.println("Idiot = " + Idiot);

        System.out.println("Nabokov.equals(Nabokov2) = " + Nabokov.equals(Nabokov2));

        System.out.println("Nabokov.hashCode() = " + Nabokov.hashCode());
        System.out.println("Nabokov2.hashCode() = " + Nabokov2.hashCode());


    }


}
